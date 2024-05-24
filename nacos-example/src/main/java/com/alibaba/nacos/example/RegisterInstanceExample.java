/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.example;

import java.io.IOException;
import java.util.Properties;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;

/**
 * Hello world.
 *
 * @author xxc
 */
public class RegisterInstanceExample {
    public static void main(String[] args) throws NacosException, IOException {
        Properties properties = new Properties();
        properties.setProperty("serverAddr", "localhost:8848");
        properties.setProperty("namespace", "public");

        // 创建一个Nacos服务发现客户端实例
        NamingService naming = NamingFactory.createNamingService(properties);
        naming.registerInstance("nacos.test.3", "11.11.11.11", 8888, "DEFAULT");
        naming.registerInstance("nacos.test.3", "22.22.22.22", 9999, "DEFAULT");

        System.out.println(naming.getAllInstances("nacos.test.3"));

        int read = System.in.read();

    }
}
