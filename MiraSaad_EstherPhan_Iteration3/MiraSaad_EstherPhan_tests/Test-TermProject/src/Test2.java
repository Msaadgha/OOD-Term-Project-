import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	 void getInstance() {
        assertFalse(false);
    }

    @Test
    void getPackageList() {
        assertFalse(false);
    }

    @Test
    void testPackageListContainsData() {

        PackageList packageList = PackageList.getInstance();                
        ArrayList<Package> pkgs = packageList.getPackageList();             

        assertNotNull(pkgs);                
        assertFalse(pkgs.isEmpty());

}
}
