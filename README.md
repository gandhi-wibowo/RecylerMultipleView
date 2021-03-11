# RecyclerMultipleView

[![](https://jitpack.io/v/gandhi-wibowo/RecylerMultipleView.svg)](https://jitpack.io/#gandhi-wibowo/RecylerMultipleView)

## What ?
Its just my base code for multipleview type of Recyclerview. Sometime i just use this stuff in my project.
If you want to use this, just be patient, cause i just put much bug on this stuff.
So, happy debugging.

## Install ?

Add it in your root _build.gradle_ at the ed of repositories :
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

And in the dependecy section, add this

```gradle
    dependencies {
	        implementation 'com.github.gandhi-wibowo:RecylerMultipleView:$version'
	}
```

## Features ?
| Function | Return Type | Description |
| ------ | ------ | ------ |
| getSelected() | ArrayList<BaseItemModel> | get items that the value of isSelected is true |
| addSelected(item: BaseItemModel, position: Int) | - | invert isSelected value |
| addSinggleSelected(item: BaseItemModel, position: Int) | - | false all items isSelected value, and invert this item isSelected value #the selected data should be just this item|
| removeSelectedMarker() | - | false all items isSelected value |
| resetData(items: List<BaseItemModel>) | - | delete all items, and add the new items |
| clearItems()  | - | delete all items |
| updateItem(item: BaseItemModel, position: Int)  | - | update item value, and reload adapter |
| addItem(item: BaseItemModel)  | - | add one item into items |
| addItems(items: List<BaseItemModel>)  | - | add multiple item into items |
| getItems()  | List<BaseItemModel> | get all items that has added |
| removeItems(items: List<BaseItemModel>))  | - | delete all this items from existing items |
| removeItem(item: BaseItemModel)  | - | delete this items from existing items |

## Use ?

I was to lazy for make a tutorial. So just look at the example that i was put on this project.

## License
```
Copyright 2021 Gandhi Wibowo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```