package com.SuperExample;

class Dobermann extends Dog {
    @Override
    public void voice()
    {
        super.voice();
        System.out.println("Hello World from Dobermann class!");
    }
}