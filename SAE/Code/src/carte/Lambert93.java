package carte;
import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

import java.util.ArrayList;

/**
 * This class uses the lambert93 system.
 */
public class Lambert93 {

   private final static double M_PI_2         = Math.PI / 2.0;
   private final static double DEFAULT_EPS    = 1e-10;
   private final static double E_WGS84        = 0.08181919106;
   private final static double E2             = E_WGS84 / 2.0;
   private final static double LON_MERID_IERS = 3.0 * Math.PI / 180.0;
   private final static double N              = 0.7256077650;
   private final static double C              = 11_754_255.426;
   private final static double XS             =    700_000.000;
   private final static double YS             = 12_655_612.050;

   /**
    * convert latitude
    * @param latISo latiso
    * @return latitudefromiso
    */
   private static double latitudeFromLatitudeISO( final double latISo ) {
      double phi0 = 2 * atan( exp( latISo ) ) - M_PI_2;
      double phiI = 2
         * atan( pow(( 1 + E_WGS84 * sin( phi0 )) /
                     ( 1 - E_WGS84 * sin( phi0 )), E2) * exp( latISo ) )
         - M_PI_2;
      double delta = abs( phiI - phi0 );
      while( delta > DEFAULT_EPS ){
         phi0 = phiI;
         phiI =
            2 * atan( pow(
                  ( 1 + E_WGS84 * sin( phi0 ) ) /
                  ( 1 - E_WGS84 * sin( phi0 ) )  , E2)
               * exp( latISo ) ) - M_PI_2;
         delta = abs( phiI - phi0 );
      }
      return phiI;
   }

   /**
    * convert latitude
    * @param x latiso
    * @param y latiso
    * @return latitudefromiso
    */
   public  ArrayList<Double> toLatLon( double x, double y ) {
      final double dX     = x - XS;
      final double dY     = y - YS;
      final double R      = sqrt( dX * dX + dY * dY );
      final double gamma  = atan( dX / -dY );
      final double latIso = -1 / N * log( abs( R / C ) );
      x = Math.toDegrees( LON_MERID_IERS + gamma / N );
      y = Math.toDegrees( latitudeFromLatitudeISO( latIso ));
      ArrayList<Double> ret = new ArrayList<Double>();
      ret.add(x);
      ret.add(y);
      return ret;
      
   }
}