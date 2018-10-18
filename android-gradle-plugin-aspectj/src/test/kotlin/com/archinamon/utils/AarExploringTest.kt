/*
 *    Copyright 2018 Thunderhead
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.archinamon.utils

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class AarExploringTest {

    @Rule
    @JvmField
    val folder = TemporaryFolder()

    @Test
    fun noNPEIfFileNotExist() {
        findPackageNameIfAar(File("/build-cache/this/file/not/exist"))
    }
}