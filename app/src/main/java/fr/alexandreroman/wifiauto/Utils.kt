/*
 * Copyright 2018 Alexandre Roman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.alexandreroman.wifiauto

import android.content.Context
import android.content.SharedPreferences

val Context.sharedPreferencesName: String
    get() = "wifiauto"

val Context.sharedPreferences: SharedPreferences
    get() = getSharedPreferences(this.sharedPreferencesName, Context.MODE_PRIVATE)

val SharedPreferences.wifiMonitoringEnabled: Boolean
    get() = getBoolean("pref_key_service_enabled", false)

val SharedPreferences.geofenceEnabled: Boolean
    get() = getBoolean("pref_key_service_geofence", false)
