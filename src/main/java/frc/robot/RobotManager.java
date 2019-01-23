
package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;

public class RobotManager {

    public static boolean isCompetitionRobot() {
        DigitalInput competitionRobotDIO = new DigitalInput(0);
        boolean isSet = competitionRobotDIO.get();
        competitionRobotDIO.close();
        return isSet;
    }

    public static boolean isPracticeRobot() {
        DigitalInput practiceRobotDIO = new DigitalInput(1);
        boolean isSet = practiceRobotDIO.get();
        practiceRobotDIO.close();
        return isSet;
    }
}