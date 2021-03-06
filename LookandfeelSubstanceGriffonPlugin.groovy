/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class LookandfeelSubstanceGriffonPlugin {
    // the plugin version
    String version = '0.5'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [lookandfeel: '0.6']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-lookandfeel-substance-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Pluggable Look & Feel based on Substance'
    String description = '''
Pluggable Look & Feel based on [Substance][1].

Usage
-----

Refer to the [lookandfeel][2] plugin to find out how setup `lookAndFeel` and `theme` properties in the configuration.

LookAndFeel and Themes
----------------------
| *LookAndFeel* | *Theme*            |
| ------------- | ------------------ |
| Substance     | Autum              |
|               | BusinessBlackSteel |
|               | BusinessBlueSteel  |
|               | Business           |
|               | ChallengerDeep     |
|               | CremeCoffee        |
|               | Creme              |
|               | DustCoffee         |
|               | DustLook           |
|               | EmeraldDusk        |
|               | Gemini             |
|               | GraphiteAqua       |
|               | GraphiteGlass      |
|               | Graphite           |
|               | Magellan           |
|               | Mariner            |
|               | MistAqua           |
|               | MistSilver         |
|               | Moderate           |
|               | NebulaBrickWall    |
|               | Nebula             |
|               | OfficeBlue2007     |
|               | OfficeBlack2007    |
|               | OfficeSilver2007   |
|               | Raven              |
|               | Sahara             |
|               | Twilight           |

[1]: http://java.net/projects/substance
[2]: /plugin/lookandfeel
'''
}
