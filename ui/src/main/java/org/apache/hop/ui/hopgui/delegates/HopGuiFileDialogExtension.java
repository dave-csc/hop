/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hop.ui.hopgui.delegates;

import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.hop.ui.core.dialog.IFileDialog;

public class HopGuiFileDialogExtension {
  public AtomicBoolean doIt;
  public IFileDialog fileDialog;

  public HopGuiFileDialogExtension(AtomicBoolean doIt, IFileDialog fileDialog) {
    this.doIt = doIt;
    this.fileDialog = fileDialog;
  }

  /**
   * Gets doIt
   *
   * @return value of doIt
   */
  public AtomicBoolean getDoIt() {
    return doIt;
  }

  /**
   * @param doIt The doIt to set
   */
  public void setDoIt(AtomicBoolean doIt) {
    this.doIt = doIt;
  }

  /**
   * Gets fileDialog
   *
   * @return value of fileDialog
   */
  public IFileDialog getFileDialog() {
    return fileDialog;
  }

  /**
   * @param fileDialog The fileDialog to set
   */
  public void setFileDialog(IFileDialog fileDialog) {
    this.fileDialog = fileDialog;
  }
}
