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

import org.junit.Test;

public class SimpleTextDetectorTest extends TestUsingSelenium {

    @Test
    public void shouldDetectTextPixelsInYahooProfileUpdatesPage() throws Exception {
        WebPage testPage = getWebPageFor("/Yahoo!_Profile_Updates.html");
        testPage.executeJavaScript("window.resizeTo(1008, 706)");
        final TextDetector detector = new SimpleTextDetector();
        final boolean[][] textPixels = detector.detectTextPixelsIn(testPage);
        // TODO: add assertion(s)
    }

}
