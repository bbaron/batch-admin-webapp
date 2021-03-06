/*
 * Copyright 2009-2010 the original author or authors.
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
package com.enterra.batch.admin.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleItemReaderTests {
	
	private ExampleItemReader reader = new ExampleItemReader();

	@Test
	public void testRead() throws Exception {
		assertNotNull(reader.read());
	}

	@Test
	public void testExhaustRead() throws Exception {
		for(int i=0; i<5; i++) {
			assertNotNull(reader.read());
		}
		assertNull(reader.read());
	}

}
