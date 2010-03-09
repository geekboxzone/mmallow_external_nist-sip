/*
 * Copyright (C) 2009 The Android Open Source Project
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

package android.net.sip;

import javax.sip.Dialog;
import javax.sip.SipException;

public interface SipSession {
    SipProfile getLocalProfile();
    SipProfile getPeerProfile();
    SipSessionState getState();
    Dialog getDialog();

    void makeCall(SipProfile party, SessionDescription sessionDescription)
            throws SipException;
    void answerCall(SessionDescription sessionDescription) throws SipException;
    void endCall() throws SipException;

    void changeCall(SessionDescription sessionDescription) throws SipException;

    void register() throws SipException;
    void deRegister() throws SipException;
}
