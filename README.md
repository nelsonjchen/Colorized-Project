# Looking for Maintainers

I have personally chosen to bite the bullet and switch to Jetbrain's new UI which has similar, not as great, but sufficient colored project functionality built in. As such, this extension is unmaintained and as newer JB IDEs come out, become incompatible. It'll generally need continually bumping and adjustments to handle changes in JetBrain's UI. If you're interested, please make an issue, I'll move this project to an organization, and I'll try to support however I can and am willing to. I will do my best to not give the *silent* treatment. 

# Colorized-Project

🟨🟥🟩🟦

![Build](https://github.com/nelsonjchen/Colorized-Project/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/20920.svg)](https://plugins.jetbrains.com/plugin/20920)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/20920.svg)](https://plugins.jetbrains.com/plugin/20920)
![](https://img.shields.io/github/issues-closed/nelsonjchen/Colorized-Project)
![](https://img.shields.io/github/issues/nelsonjchen/Colorized-Project)
![](https://img.shields.io/jetbrains/plugin/r/rating/20920)

<!-- Plugin description -->
Remember your projects by color! Colorize the window somehow to differentiate your open projects. Updated and [maintained](https://github.com/nowtilous/Project-Color/issues/) fork of Project-Color from [yon/@nowtilous](https://github.com/nowtilous/).

NOTE: [This does not work with the new GUI. The functionality should be built in though when it is out of beta though](https://blog.jetbrains.com/idea/2023/06/intellij-idea-2023-2-eap-6/#:~:text=User%20experience-,Colored%20project%20headers%20in%20the%20new%20UI,-IntelliJ%20IDEA%202023.2)

Working on multiple projects simultaneously with Jetbrains products based on IntelliJ can be difficult, since they all look the same at a glance. This plugin solves that by giving the user the option to colorize each project's window in a noticeable way.
<!-- Plugin description end -->

## Usage & Screenshots 🖥️

![](/screenshots/usage.gif)
![](/screenshots/desktop_multiple_projects.png)
![](/screenshots/color_picker_menu.png)
![](/screenshots/taskbar_view.png)

## Compatibility ⚙️

Supports all Intellij IDEs from version 2023.1.2 (231) and above!

> ✅ Tested on all versions up to 2022.3.1

> ❌ Supported version is very conservative. Open an issue if IntelliJ updates and it disables.

> ❌ Does not work with new GUI, yet.

> ✅ Works on all Jetbrains IntelliJ products.

> ✅ Supports Windows🪟, MacOS🍎 , and Linux🐧 distributions (that Jetbrains support)!

## Features 💪

  - Set menu frame, menu bar, or bar color (as shown in the Screenshots section).
  > ❔ Next to the build icons, a colorful cube button will popup a menu which allows you to choose colors from.
  - Automatically select colors for all projects, based on every project name.
  > ❔ In the color chooser menu, select the 'Options' tab, and check the auto color set checkbox.

  - The foreground color is highlighted according to the darkness of the chosen color, in order to have a comfortable contrast from the background.

## Installation 🛠️

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Colorized-Project"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/nelsonjchen/Colorized-Project/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[original]: https://github.com/nowtilous/Project-Color/issues/
