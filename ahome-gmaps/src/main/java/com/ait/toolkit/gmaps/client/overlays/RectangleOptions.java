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
package com.ait.toolkit.gmaps.client.overlays;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.core.LatLngBounds;

public class RectangleOptions extends AbstractOption {

    public RectangleOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Returns the bounds of this rectangle.
     * 
     * @return
     */
    public final native LatLngBounds getBounds()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.ait.toolkit.gmaps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native void setBounds(LatLngBounds value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bounds = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * Indicates whether this Rectangle handles click events. Defaults to true.
     * 
     * @param value
     */
    public final native void setClickable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public final native boolean isClickable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    /**
     * Render each edge as a geodesic (a segment of a "great circle"). A
     * geodesic is the shortest path between two points along the surface of the
     * Earth
     * 
     * @param value
     */
    public final native void setGeodesic(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.geodesic = value;
    }-*/;

    public final native boolean getGeodesic()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.geodesic;
    }-*/;

    /**
     * The ordered sequence of coordinates of the Polyline. This path may be
     * specified using either a simple array of LatLngs, or an MVCArray of
     * LatLngs. Note that if you pass a simple array, it will be converted to an
     * MVCArray Inserting or removing LatLngs in the MVCArray will automatically
     * update the polyline on the map.
     * 
     * @param values
     */
    public final native void setPath(Object values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.path = values;
    }-*/;

    public final native <T> T getPath()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.path;
    }-*/;

    /**
     * The stroke color. All CSS3 colors are supported except for extended named
     * colors.
     * 
     * @param value
     */
    public final native void setStrokeColor(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeColor = value;
    }-*/;

    public final native String getStrokeColor()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeColor;
    }-*/;

    /**
     * The stroke opacity between 0.0 and 1.0
     * 
     * @param value
     */
    public final native void setStrokeOpacity(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeOpacity = value;
    }-*/;

    public final native double getStrokeOpacity()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeOpacity;
    }-*/;

    /**
     * The stroke width in pixels.
     * 
     * @param value
     */
    public final native void setStrokeWeight(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.strokeWeight = value;
    }-*/;

    public final native double getStrokeWeight()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.strokeWeight;
    }-*/;

    /**
     * The zIndex compared to other polys.
     * 
     * @param value
     */
    public final native void setZIndex(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public final native double getZIndex()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;
}
