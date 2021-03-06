/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.program.model.symbol;

import java.util.Iterator;

import util.CollectionUtils;

/**
 * Iterator defined to return Symbol objects.
 * 
 * @see CollectionUtils#asIterable
 */
public interface SymbolIterator extends Iterator<Symbol>, Iterable<Symbol> {

	public static final SymbolIterator EMPTY_ITERATOR = new SymbolIterator() {

		@Override
		public Iterator<Symbol> iterator() {
			return this;
		}

		@Override
		public Symbol next() {
			return null;
		}

		@Override
		public boolean hasNext() {
			return false;
		}
	};

	/**
	 * Return true if there is a next symbol.
	 */
	@Override
	public boolean hasNext();

	/**
	 * Get the next symbol or null if no more symbols.
	 * <P>NOTE: This deviates from the standard {@link Iterator} interface
	 * by returning null instead of throwing an exception.
	 */
	@Override
	public Symbol next();

}
