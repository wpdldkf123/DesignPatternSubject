package hf.dp.CommandPattern;

public class Button {
    private Command theCommand;

    public Button(Command theCommand){
        setTheCommand(theCommand);
    }
    public void setTheCommand(Command newCommand){
        this.theCommand = newCommand;
    }
    public void pressed(){
        theCommand.execute();
    }
}
