package org.apache.dubbo.springboot.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.FirstService;

/**
 * @author liujinshan.
 * @author 2024/3/8.
 * @author 17:20.
 */
@DubboService
public class FirstServiceImpl implements FirstService {
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
