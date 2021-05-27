//[kakao](../../../index.md)/[io.github.kakaocup.kakao.list](../index.md)/[DataBuilder](index.md)



# DataBuilder  
 [androidJvm] class [DataBuilder](index.md)

Class for building data matchers



This class helps to build matches for data. Please note that any function invoking will add specific matcher to the list and after that all of them will be combined with help of AllOf.allOf()

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/DataBuilder///PointingToDeclaration/"></a>org.hamcrest.core.AllOf| <a name="io.github.kakaocup.kakao.list/DataBuilder///PointingToDeclaration/"></a><br><br>()<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/DataBuilder/#/PointingToDeclaration/"></a>[DataBuilder](-data-builder.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/DataBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [DataBuilder](-data-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/equals/#kotlin.Any/PointingToDeclaration/"></a>[equals](equals.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/equals/#kotlin.Any/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [equals](equals.md)(obj: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br>More info  <br>Matches data which is equal to given object  <br><br><br>|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/getDataMatcher/#/PointingToDeclaration/"></a>[getDataMatcher](get-data-matcher.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/getDataMatcher/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getDataMatcher](get-data-matcher.md)(): Matcher<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>  <br>More info  <br>Returns combined data matchers with AllOf.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/isInstanceOf/#java.lang.Class[*]/PointingToDeclaration/"></a>[isInstanceOf](is-instance-of.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/isInstanceOf/#java.lang.Class[*]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isInstanceOf](is-instance-of.md)(clazz: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)<*>)  <br>More info  <br>Matches data whose class matches given class  <br><br><br>|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/notEquals/#kotlin.Any/PointingToDeclaration/"></a>[notEquals](not-equals.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/notEquals/#kotlin.Any/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [notEquals](not-equals.md)(obj: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br>More info  <br>Matches data which is not equal to given object  <br><br><br>|
| <a name="io.github.kakaocup.kakao.list/DataBuilder/withMatcher/#org.hamcrest.Matcher[kotlin.Any]/PointingToDeclaration/"></a>[withMatcher](with-matcher.md)| <a name="io.github.kakaocup.kakao.list/DataBuilder/withMatcher/#org.hamcrest.Matcher[kotlin.Any]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withMatcher](with-matcher.md)(matcher: Matcher<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>More info  <br>Matches data with given custom matcher  <br><br><br>|

