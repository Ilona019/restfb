/**
 * Copyright (c) 2010-2019 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.restfb.AbstractJsonMapperTests;

class PhotoTagsTest extends AbstractJsonMapperTests {

  @Test
  void checkNoBackdateV1_0() {
    Photo examplePhoto = createJsonMapper().toJavaObject(jsonFromClasspath("v1_0/photo-nobackdate"), Photo.class);
    assertEquals(1, examplePhoto.getTags().size());
    assertEquals(46.428571428571, examplePhoto.getTags().get(0).getX().doubleValue());
    assertEquals(53.571428571429, examplePhoto.getTags().get(0).getY().doubleValue());
  }

  @Test
  void checkNoBackdateV2_0() {
    Photo examplePhoto = createJsonMapper().toJavaObject(jsonFromClasspath("v2_0/photo-nobackdate"), Photo.class);
    assertEquals(1, examplePhoto.getTags().size());
    assertEquals(46.428571428571, examplePhoto.getTags().get(0).getX().doubleValue());
    assertEquals(53.571428571429, examplePhoto.getTags().get(0).getY().doubleValue());
  }

  @Test
  void checkNoBackdateV2_1() {
    Photo examplePhoto = createJsonMapper().toJavaObject(jsonFromClasspath("v2_1/photo-nobackdate"), Photo.class);
    assertEquals(1, examplePhoto.getTags().size());
    assertEquals(46.428571428571, examplePhoto.getTags().get(0).getX().doubleValue());
    assertEquals(53.571428571429, examplePhoto.getTags().get(0).getY().doubleValue());
  }
}
