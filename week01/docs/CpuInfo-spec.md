# CPU 核心数查询接口开发文档

## 1. 接口概述

基于 Spring Boot 3.x 开发的 CPU 核心数查询接口，延续 HelloController 设计风格，提供 CPU 逻辑核心数、物理核心数（估算）查询能力，返回格式统一使用 ResultVO 封装。

## 2. 接口设计

### 2.1 基础信息

表格







|   项⽬   |         说明          |
| :------: | :-------------------: |
| 基础路径 |     `/api/system`     |
| 请求方式 |          GET          |
| 返回格式 | JSON（ResultVO 封装） |
|   依赖   | Lombok（@Data 注解）  |

### 2.2 具体接口

表格







|             接口地址             |       方法名        |          功能说明           |
| :------------------------------: | :-----------------: | :-------------------------: |
|     `/api/system/cpu/cores`      |     getCpuCores     |     查询 CPU 逻辑核心数     |
| `/api/system/cpu/physical-cores` | getPhysicalCpuCores | 估算 CPU 物理核心数（参考） |