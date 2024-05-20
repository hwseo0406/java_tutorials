package org.opentutorials.javatutorials.accessmodifier.inner;

public class InnerPackageClassAccessModifier {

    //퍼블릭이라 당연히 가능
    PublicClass publicClass = new PublicClass();
    //디폴트여도 같은 패키지여서 가능(default는 같은 클래스,패키지에서 가능)
    DefaultClass defaultClass = new DefaultClass();

}
