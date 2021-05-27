//[kakao](../../../index.md)/[io.github.kakaocup.kakao.common.builders](../index.md)/[RootBuilder](index.md)



# RootBuilder  
 [androidJvm] class [RootBuilder](index.md)

Class for building root matchers



This class helps to build matches for root. Please note that any function invoking will add specific matcher to the list and after that all of them will be combined with help of AllOf.allOf()

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder///PointingToDeclaration/"></a>org.hamcrest.core.AllOf| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder///PointingToDeclaration/"></a><br><br>()<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/RootBuilder/#/PointingToDeclaration/"></a>[RootBuilder](-root-builder.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/RootBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [RootBuilder](-root-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/getRootMatcher/#/PointingToDeclaration/"></a>[getRootMatcher](get-root-matcher.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/getRootMatcher/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getRootMatcher](get-root-matcher.md)(): Matcher<Root>  <br>More info  <br>Returns combined root matchers with AllOf.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isDialog/#/PointingToDeclaration/"></a>[isDialog](is-dialog.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isDialog/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isDialog](is-dialog.md)()  <br>More info  <br>Matches root that is dialog  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isFocusable/#/PointingToDeclaration/"></a>[isFocusable](is-focusable.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isFocusable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isFocusable](is-focusable.md)()  <br>More info  <br>Matches root that is focusable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotDialog/#/PointingToDeclaration/"></a>[isNotDialog](is-not-dialog.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotDialog/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNotDialog](is-not-dialog.md)()  <br>More info  <br>Matches root that is not dialog  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotFocusable/#/PointingToDeclaration/"></a>[isNotFocusable](is-not-focusable.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotFocusable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNotFocusable](is-not-focusable.md)()  <br>More info  <br>Matches root that is not focusable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotPlatformPopup/#/PointingToDeclaration/"></a>[isNotPlatformPopup](is-not-platform-popup.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotPlatformPopup/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNotPlatformPopup](is-not-platform-popup.md)()  <br>More info  <br>Matches root that is not platform popup  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotSystemAlertWindow/#/PointingToDeclaration/"></a>[isNotSystemAlertWindow](is-not-system-alert-window.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotSystemAlertWindow/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNotSystemAlertWindow](is-not-system-alert-window.md)()  <br>More info  <br>Matches root that is not system alert window  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotTouchable/#/PointingToDeclaration/"></a>[isNotTouchable](is-not-touchable.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isNotTouchable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNotTouchable](is-not-touchable.md)()  <br>More info  <br>Matches root that is not touchable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isPlatformPopup/#/PointingToDeclaration/"></a>[isPlatformPopup](is-platform-popup.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isPlatformPopup/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isPlatformPopup](is-platform-popup.md)()  <br>More info  <br>Matches root that is platform popup  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isSystemAlertWindow/#/PointingToDeclaration/"></a>[isSystemAlertWindow](is-system-alert-window.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isSystemAlertWindow/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isSystemAlertWindow](is-system-alert-window.md)()  <br>More info  <br>Matches root that is system alert window  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isTouchable/#/PointingToDeclaration/"></a>[isTouchable](is-touchable.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/isTouchable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isTouchable](is-touchable.md)()  <br>More info  <br>Matches root that is touchable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/withDecorView/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[withDecorView](with-decor-view.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/withDecorView/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withDecorView](with-decor-view.md)(function: [ViewBuilder](../-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Matches root that has decor view matching given matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/withMatcher/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[withMatcher](with-matcher.md)| <a name="io.github.kakaocup.kakao.common.builders/RootBuilder/withMatcher/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withMatcher](with-matcher.md)(matcher: Matcher<Root>)  <br>More info  <br>Matches root with given custom matcher  <br><br><br>|

