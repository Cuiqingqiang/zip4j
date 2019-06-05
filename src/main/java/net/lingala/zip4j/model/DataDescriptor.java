/*
 * Copyright 2010 Srikanth Reddy Lingala
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.lingala.zip4j.model;

public class DataDescriptor extends ZipHeader {

  private int crc32;
  private long compressedSize;
  private long uncompressedSize;

  public int getCrc32() {
    return crc32;
  }

  public void setCrc32(int crc32) {
    this.crc32 = crc32;
  }

  public long getCompressedSize() {
    return compressedSize;
  }

  public void setCompressedSize(long compressedSize) {
    this.compressedSize = compressedSize;
  }

  public long getUncompressedSize() {
    return uncompressedSize;
  }

  public void setUncompressedSize(long uncompressedSize) {
    this.uncompressedSize = uncompressedSize;
  }

}
