package DifferentAccessModifier;

import DifferentAccessModifier.DefaultModifier.DefaultModifierSample;

class A extends DefaultModifierSample {

    public void getDefault() {
        System.out.println(this.grade);
    }
}

public class AccessModifierMain {

    public static void main(String[] args) {
        A a = new A();
        a.getDefault();

    }

}
