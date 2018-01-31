import java.text.DecimalFormat;

class SpaceAge {

    double seconds;

    static final double EARTH_PERIOD = 31557600;
    static final double MERCURY_PERIOD = 0.2408467 * EARTH_PERIOD;
    static final double VENUS_PERIOD = 0.61519726 * EARTH_PERIOD;
    static final double MARS_PERIOD = 1.8808158 * EARTH_PERIOD;
    static final double JUPITER_PERIOD = 11.862615 * EARTH_PERIOD;
    static final double SATURN_PERIOD = 29.447498 * EARTH_PERIOD;
    static final double URANUS_PERIOD = 84.016846 * EARTH_PERIOD;
    static final double NEPTUNE_PERIOD = 164.79132 * EARTH_PERIOD;



    static DecimalFormat df2 = new DecimalFormat(".##");

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return Math.round((seconds/EARTH_PERIOD)*1E2)/1E2;
    }

    double onMercury() {
        return Math.round((seconds/MERCURY_PERIOD)*1E2)/1E2;
    }

    double onVenus() {
        return Math.round((seconds/VENUS_PERIOD)*1E2)/1E2;
    }

    double onMars() {
        return Math.round((seconds/MARS_PERIOD)*1E2)/1E2;
    }

    double onJupiter() {
        return Math.round((seconds/JUPITER_PERIOD)*1E2)/1E2;
    }

    double onSaturn() {
        return Math.round((seconds/SATURN_PERIOD)*1E2)/1E2;
    }

    double onUranus() {
        return Math.round((seconds/URANUS_PERIOD)*1E2)/1E2;
    }

    double onNeptune() {
        return Math.round((seconds/NEPTUNE_PERIOD)*1E2)/1E2;
    }

}
