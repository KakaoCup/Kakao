//[kakao](../../../index.md)/[io.github.kakaocup.kakao.screen](../index.md)/[ScreenActions](index.md)



# ScreenActions  
 [androidJvm] interface [ScreenActions](index.md)

Interface with common actions for all screens



Provides basic actions that can be performed on each and every screen

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/closeSoftKeyboard/#/PointingToDeclaration/"></a>[closeSoftKeyboard](close-soft-keyboard.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/closeSoftKeyboard/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [closeSoftKeyboard](close-soft-keyboard.md)()  <br>More info  <br>Closes soft keyboard, if opened  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressBack/#/PointingToDeclaration/"></a>[pressBack](press-back.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressBack/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressBack](press-back.md)()  <br>More info  <br>Performs click on device's back button  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressKey/#androidx.test.espresso.action.EspressoKey/PointingToDeclaration/"></a>[pressKey](press-key.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressKey/#androidx.test.espresso.action.EspressoKey/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressKey](press-key.md)(key: EspressoKey)  <br>More info  <br>Presses a key with correspondingKeyCode and modifiers  <br><br><br>[androidJvm]  <br>Content  <br>open fun [pressKey](press-key.md)(keyCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Presses a key with corresponding KeyCode  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressMenuKey/#/PointingToDeclaration/"></a>[pressMenuKey](press-menu-key.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressMenuKey/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressMenuKey](press-menu-key.md)()  <br>More info  <br>Presses the hardware menu key  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/view/#/PointingToDeclaration/"></a>[view](view.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/view/#/PointingToDeclaration/"></a> [androidJvm] abstract val [view](view.md): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)ViewInteractionDelegate on which all actions are performed (root view by default)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.screen/Screen///PointingToDeclaration/"></a>[Screen](../-screen/index.md)|

