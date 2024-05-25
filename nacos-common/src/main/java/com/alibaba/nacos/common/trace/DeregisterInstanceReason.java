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

package com.alibaba.nacos.common.trace;

/**
 * The reasons of deregister instance.
 *
 * @author yanda
 */
public enum DeregisterInstanceReason {
    /**
     * client initiates request.
     */
    REQUEST,
    /**
     * 实例本机已断开连接。
     * Instance native disconnected.
     */
    NATIVE_DISCONNECTED,
    /**
     * 实例同步已断开连接
     * Instance synced disconnected.
     */
    SYNCED_DISCONNECTED,
    /**
     * 实例心跳超时过期
     * Instance heart beat timeout expire.
     */
    HEARTBEAT_EXPIRE,
   
}
