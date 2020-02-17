package com.ss.designPatterns.behavioral.mediator2;

/*
every Participant will have mediator
But at no time a Person will reference another Person
 */
public class ChatMain {
    public static void main(String[] args) {
        ChatMediator room = new ChatMediator();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        //nobody to receive message that John joined the room
        room.join(john);
        room.join(jane);

        john.say("hi room");
        jane.say("oh, hey john");

        Person simon = new Person("Simon");
        room.join(simon);
        simon.say("hi everyone!");

        jane.privateMessage("Simon", "glad you could join us!");
    }
}
