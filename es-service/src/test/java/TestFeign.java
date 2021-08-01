import org.example.core.EsApplication;
import org.example.core.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/8/1
 */
@SpringBootTest(classes = EsApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TestFeign {

    @Resource
    private AreaService areaService;

    @Test
    public void test() {
        areaService.importAll();
    }
}
