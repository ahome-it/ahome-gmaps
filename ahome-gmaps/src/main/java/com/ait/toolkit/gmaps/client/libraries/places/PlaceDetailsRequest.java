/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.gmaps.client.libraries.places;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class PlaceDetailsRequest extends JsObject {

    public PlaceDetailsRequest() {
        jsObj = JsoHelper.createObject();
    }

    protected PlaceDetailsRequest(JavaScriptObject peer) {
        jsObj = peer;
    }

    public String getReference() {
        return JsoHelper.getAttribute(jsObj, "reference");
    }

    public void setReference(String value) {
        JsoHelper.setAttribute(jsObj, "reference", value);
    }

    public String getType() {
        return JsoHelper.getAttribute(jsObj, "type");
    }

    public void setType(String value) {
        JsoHelper.setAttribute(jsObj, "type", value);
    }
}
