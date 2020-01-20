package com.ss.java8.newfeatures.section11;

import java.util.function.*;

/*
Primitive functional interfaces
 */
public class TestP3 {

    public static void main(String[] args) {

        //IntPredicate
        System.out.println("*******************************************************");
        int[] x= {0,5,10,15,20,25};
        IntPredicate i1 = (i)-> i%2==0;
        for (int x1: x){
            if (i1.test(x1)) {
                System.out.println(x1 + " isEven");
            }
        }

        //IntFunction
        System.out.println("*******************************************************");
        int[] x1= {0,5,10,15,20,25};
        IntFunction<Integer> i2 = (i)-> i*i;
        for (int x2: x1){
                System.out.println(i2.apply(x2));
        }

        //ToIntFunction input anytype but return type is int primitive
        System.out.println("*******************************************************");
        ToIntFunction<String> s1 = s->s.length();
        System.out.println(s1.applyAsInt("steve"));

        //ToIntFunction input anytype but return type is int primitive
        System.out.println("*******************************************************");
        IntToDoubleFunction i3 = i->Math.sqrt(i);
        System.out.println(i3.applyAsDouble(5));

        //primitive version of consumer...autoboxing not required..longconsumer...doubleconsumer
        System.out.println("*******************************************************");
        IntConsumer i4 = i-> System.out.println(i*i);
        i4.accept(4);

        //1st input-- Object, 2nd-- integer
        System.out.println("*******************************************************");
//        ObjIntConsumer<String>

        //1st input-- Object, 2nd-- long
        System.out.println("*******************************************************");
//        ObjLongConsumer<String>

        //1st input-- Object, 2nd-- double
        System.out.println("*******************************************************");
//        ObjDoubleConsumer<String>

        //IntSupplier
        System.out.println("*******************************************************");
        IntSupplier s2 = ()-> (int) (Math.random()*10);
        System.out.println(s2.getAsInt());
        System.out.println(s2.getAsInt());

        //UnaryOperator-- same type input and output that is why 1 type
        //autoboxing/autounboxing
        System.out.println("*******************************************************");
        UnaryOperator<Integer> u1= (i)->i*i;
        System.out.println(u1.apply(10));
        System.out.println(u1.apply(6));

        //BinaryOperator--all 3types of paramters are the same
        // 1st-input 2nd-input 3rd-return all the same
        System.out.println("*******************************************************");
        BinaryOperator<String> bo1 = (s11, s22)-> s11.concat(s22);
        System.out.println(bo1.apply("steve ", "happy"));

        //primitive! BinaryOperator--Int Long Double
        System.out.println("*******************************************************");
        IntBinaryOperator ibo1 = (ibo2, ibo3)->ibo2*ibo3;
        System.out.println(ibo1.applyAsInt(8,5));

    }
}
