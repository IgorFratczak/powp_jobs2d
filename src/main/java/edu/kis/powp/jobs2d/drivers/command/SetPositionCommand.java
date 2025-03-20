package edu.kis.powp.jobs2d.drivers.command;

public class SetPositionCommand implements DriverCommand{
    private int x, y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(){}
}
