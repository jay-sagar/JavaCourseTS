package SolidPrinciple;

import java.io.InvalidClassException;

// High level models should not be depended on low level models, both should depend on the abstraction
public class DependencyInversionPrinciple {
    public static void main(String[] args) throws InvalidClassException {
        NotePad n1 = new NotePad("virtual");
        n1.startTyping();
    }
}

interface InputDevice {
    void type();
}

class Keyboard implements InputDevice{
    public void type() {
        System.out.println("typing using keyboard");
    }
}

class VirtualKeyboard implements InputDevice {
    @Override
    public void type() {
        System.out.println("typing using virtual keyboard");
    }
}

class NotePad {
    InputDevice device;

    public NotePad(String keyboardType) throws InvalidClassException {
        if (keyboardType.equalsIgnoreCase("Virtual")) {
            device = new VirtualKeyboard();
        } else if (keyboardType.equalsIgnoreCase("Keyboard")) {
            device = new Keyboard();
        } else {
            throw new InvalidClassException("Please enter a correct typing method");
        }

    }

    public void startTyping() {
        device.type();
    }
}