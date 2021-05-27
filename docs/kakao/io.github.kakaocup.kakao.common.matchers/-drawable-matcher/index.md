//[kakao](../../../index.md)/[io.github.kakaocup.kakao.common.matchers](../index.md)/[DrawableMatcher](index.md)



# DrawableMatcher  
 [androidJvm] class [DrawableMatcher](index.md)(@[DrawableRes](https://developer.android.com/reference/kotlin/androidx/annotation/DrawableRes.html)()**resId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **drawable**: [Drawable](https://developer.android.com/reference/kotlin/android/graphics/drawable/Drawable.html)?, @[ColorRes](https://developer.android.com/reference/kotlin/androidx/annotation/ColorRes.html)()**tintColorId**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?, **toBitmap**: (drawable: [Drawable](https://developer.android.com/reference/kotlin/android/graphics/drawable/Drawable.html)) -> [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)?) : TypeSafeMatcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)> 

Matches given drawable with current one

   


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a>resId| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a><br><br>Drawable resource to be matched (default is -1)<br><br>|
| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a>drawable| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a><br><br>Drawable instance to be matched (default is null)<br><br>|
| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a>toBitmap| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher///PointingToDeclaration/"></a><br><br>Lambda with custom Drawable -> Bitmap converter (default is null)<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher/DrawableMatcher/#kotlin.Int#android.graphics.drawable.Drawable?#kotlin.Int?#kotlin.Function1[android.graphics.drawable.Drawable,android.graphics.Bitmap]?/PointingToDeclaration/"></a>[DrawableMatcher](-drawable-matcher.md)| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher/DrawableMatcher/#kotlin.Int#android.graphics.drawable.Drawable?#kotlin.Int?#kotlin.Function1[android.graphics.drawable.Drawable,android.graphics.Bitmap]?/PointingToDeclaration/"></a> [androidJvm] fun [DrawableMatcher](-drawable-matcher.md)(@[DrawableRes](https://developer.android.com/reference/kotlin/androidx/annotation/DrawableRes.html)()resId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = -1, drawable: [Drawable](https://developer.android.com/reference/kotlin/android/graphics/drawable/Drawable.html)? = null, @[ColorRes](https://developer.android.com/reference/kotlin/androidx/annotation/ColorRes.html)()tintColorId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, toBitmap: (drawable: [Drawable](https://developer.android.com/reference/kotlin/android/graphics/drawable/Drawable.html)) -> [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)? = null)Drawable resource to be matched (default is -1)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="org.hamcrest/BaseMatcher/_dont_implement_Matcher___instead_extend_BaseMatcher_/#/PointingToDeclaration/"></a>[_dont_implement_Matcher___instead_extend_BaseMatcher_](../-view-pager2-adapter-size-matcher/index.md#1188943711%2FFunctions%2F34310170)| <a name="org.hamcrest/BaseMatcher/_dont_implement_Matcher___instead_extend_BaseMatcher_/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>~~override~~ ~~fun~~ [~~_dont_implement_Matcher___instead_extend_BaseMatcher_~~](../-view-pager2-adapter-size-matcher/index.md#1188943711%2FFunctions%2F34310170)~~(~~~~)~~  <br><br><br>|
| <a name="org.hamcrest/TypeSafeMatcher/describeMismatch/#kotlin.Any#org.hamcrest.Description/PointingToDeclaration/"></a>[describeMismatch](../-text-input-layout-hint-enabled-matcher/index.md#334181509%2FFunctions%2F34310170)| <a name="org.hamcrest/TypeSafeMatcher/describeMismatch/#kotlin.Any#org.hamcrest.Description/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>override fun [describeMismatch](../-text-input-layout-hint-enabled-matcher/index.md#334181509%2FFunctions%2F34310170)(p0: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), p1: Description)  <br><br><br>|
| <a name="org.hamcrest/TypeSafeMatcher/describeMismatchSafely/#android.view.View#org.hamcrest.Description/PointingToDeclaration/"></a>[describeMismatchSafely](../-text-input-layout-hint-enabled-matcher/index.md#-1946039083%2FFunctions%2F34310170)| <a name="org.hamcrest/TypeSafeMatcher/describeMismatchSafely/#android.view.View#org.hamcrest.Description/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [describeMismatchSafely](../-text-input-layout-hint-enabled-matcher/index.md#-1946039083%2FFunctions%2F34310170)(p0: [View](https://developer.android.com/reference/kotlin/android/view/View.html), p1: Description)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher/describeTo/#org.hamcrest.Description/PointingToDeclaration/"></a>[describeTo](describe-to.md)| <a name="io.github.kakaocup.kakao.common.matchers/DrawableMatcher/describeTo/#org.hamcrest.Description/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [describeTo](describe-to.md)(desc: Description)  <br><br><br>|
| <a name="org.hamcrest/TypeSafeMatcher/matches/#kotlin.Any/PointingToDeclaration/"></a>[matches](../-text-input-layout-hint-enabled-matcher/index.md#-1371377999%2FFunctions%2F34310170)| <a name="org.hamcrest/TypeSafeMatcher/matches/#kotlin.Any/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>override fun [matches](../-text-input-layout-hint-enabled-matcher/index.md#-1371377999%2FFunctions%2F34310170)(p0: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="org.hamcrest/BaseMatcher/toString/#/PointingToDeclaration/"></a>[toString](../-view-pager2-adapter-size-matcher/index.md#-908184799%2FFunctions%2F34310170)| <a name="org.hamcrest/BaseMatcher/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../-view-pager2-adapter-size-matcher/index.md#-908184799%2FFunctions%2F34310170)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|

