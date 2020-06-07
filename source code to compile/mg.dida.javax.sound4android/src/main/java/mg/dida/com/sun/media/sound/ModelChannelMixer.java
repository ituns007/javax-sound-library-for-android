/*
 * Copyright (c) 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package mg.dida.com.sun.media.sound;

import mg.dida.javax.sound.share.classes.javax.sound.midi.MidiChannel;

/**
 * ModelChannelMixer is used to process channel voice mix output before going
 * to master output.<br>
 * It can be used to:<br>
 * <ul>
 *   <li>Implement non-voice oriented instruments.</li>
 *   <li>Add insert effect to instruments; for example distortion effect.</li>
 * </ui>
 * <p>
 * <b>Warning! Classes that implements ModelChannelMixer must be thread-safe.</b>
 *
 * @author Karl Helgason
 */
public interface ModelChannelMixer extends MidiChannel {

    // Used to process input audio from voices mix.
    public boolean process(float[][] buffer, int offset, int len);

    // Is used to trigger that this mixer is not be used
    // and it should fade out.
    public void stop();
}
