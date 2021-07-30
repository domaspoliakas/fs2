/*
 * Copyright (c) 2013 Functional Streams for Scala
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package fs2.io.file2

import java.nio.file.OpenOption
import java.nio.file.StandardOpenOption

case class Flag(option: OpenOption)

object Flag extends FlagCompanionApi {
  val Read = Flag(StandardOpenOption.READ)
  val Write = Flag(StandardOpenOption.WRITE)
  val Append = Flag(StandardOpenOption.APPEND)

  val Truncate = Flag(StandardOpenOption.TRUNCATE_EXISTING)
  val Create = Flag(StandardOpenOption.CREATE)
  val CreateNew = Flag(StandardOpenOption.CREATE_NEW)

  val DeleteOnClose = Flag(StandardOpenOption.DELETE_ON_CLOSE)
  val Sparse = Flag(StandardOpenOption.SPARSE)
  val Sync = Flag(StandardOpenOption.SYNC)
  val Dsync = Flag(StandardOpenOption.DSYNC)
}