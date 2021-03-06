/*
 * Copyright 2009-2012 Michael Tamm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xpanxion.fightinglayoutbugs;

import edu.umd.cs.findbugs.annotations.Nullable;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.Collection;

public interface LayoutBugDetector {

    /**
     * Call this method before you call {@code findLayoutBugsIn} if you
     * want to specify where screenshots of detected layout bugs should
     * be stored.
     *
     * @param screenshotDir if {@code null}, no screenshots will be stored
     */
    void setScreenshotDir(@Nullable File screenshotDir);

    /**
     * Finds layout bugs in the given web page.
     * @param webPage picks up a Web page for evaluation
     * @return Returns a collection of Layout Bugs on the Web Page
     */
    Collection<LayoutBug> findLayoutBugsIn(@Nonnull WebPage webPage);
}
