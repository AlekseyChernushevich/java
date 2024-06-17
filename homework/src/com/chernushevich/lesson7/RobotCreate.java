package com.chernushevich.lesson7;

public class RobotCreate {
    public void createRobot() {
        RobotCreate[] robots = new RobotCreate[3];
        Head[] heads = new HeadFactory().create();
        Body[] bodies = new BodyFactory().create();
    }
}