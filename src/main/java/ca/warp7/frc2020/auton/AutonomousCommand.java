package ca.warp7.frc2020.auton;

import ca.warp7.frc2020.Constants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class AutonomousCommand extends CommandBase {

    private AutonomousSelector selector = AutonomousSelector.getInstance();

    @SuppressWarnings({"ConstantConditions", "StatementWithEmptyBody"})
    @Override
    public void initialize() {

        Command mode;
        //if (Constants.isPracticeRobot()) {
            mode = AutonomousMode.simplePath();
        //} else {
//            mode = selector.getSelectedMode().create();
        //}
        mode.schedule();
    }
}
