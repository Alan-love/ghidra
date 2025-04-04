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
package ghidra.pcode.emu.jit.gen.op;

import ghidra.pcode.emu.jit.op.JitBoolOrOp;
import ghidra.pcode.opbehavior.OpBehaviorBoolOr;

/**
 * The generator for a {@link JitBoolOrOp bool_or}.
 * 
 * @implNote It is the responsibility of the slaspec author to ensure boolean values are 0 or 1.
 *           This allows us to use bitwise logic instead of having to check for any non-zero value,
 *           just like {@link OpBehaviorBoolOr}. Thus, this is identical to {@link IntOrOpGen}.
 */
public enum BoolOrOpGen implements BitwiseBinOpGen<JitBoolOrOp> {
	/** The generator singleton */
	GEN;

	@Override
	public int intOpcode() {
		return IOR;
	}

	@Override
	public int longOpcode() {
		return LOR;
	}
}
