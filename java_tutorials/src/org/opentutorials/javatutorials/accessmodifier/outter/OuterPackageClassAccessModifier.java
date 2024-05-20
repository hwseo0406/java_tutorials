package org.opentutorials.javatutorials.accessmodifier.outter;

import org.opentutorials.javatutorials.accessmodifier.inner.*;

public class OuterPackageClassAccessModifier {
    PublicClass publicClass = new PublicClass();
    // 오류 메세지 - 'org.opentutorials.javatutorials.accessmodifier.inner.DefaultClass' is not public in 'org.opentutorials.javatutorials.accessmodifier.inner'. Cannot be accessed from outside package
    //DefaultClass defaultClass = new DefaultClass();
}
