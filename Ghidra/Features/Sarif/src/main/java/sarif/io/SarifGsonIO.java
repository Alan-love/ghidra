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
package sarif.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.contrastsecurity.sarif.SarifSchema210;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class SarifGsonIO implements SarifIO {
	
	@Override
	public SarifSchema210 readSarif(File file) throws JsonSyntaxException, IOException {
		Gson gson = new Gson();
		return gson.fromJson(Files.readString(file.toPath()), SarifSchema210.class);
	}

	@Override
	public SarifSchema210 readSarif(String str) throws JsonSyntaxException, IOException {
		Gson gson = new Gson();
		return gson.fromJson(str, SarifSchema210.class);
	}

}
