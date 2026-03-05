## 初始化本地仓库

```javascript
git init
```

## 添加所有文件到暂存区

```javascript
git add .
```

## 提交到本地仓库

```javascript
git commit -m "init: 初始化 spring-boot-course 项目"
```

## 常用提交类型说明

- **feat**：新增功能
  示例：`feat: 新增用户登录接口`
- **fix**：修复 Bug
  示例：`fix: 修复文章删除接口 bug`
- **docs**：文档更新（README、注释等）
  示例：`docs: 更新项目的 README 文档`
- **style**：代码风格调整（不影响功能，比如空格、格式化）
  示例：`style: 对 UserController 接口进行格式化`
- **refactor**：代码重构（既不是新增功能，也不是修 Bug）
  示例：`refactor: 重构项目的异常处理体系`
- **test**：添加或修改测试代码
  示例：`test: 添加 TodoController 的单元测试`
- **chore**：构建/工具/依赖相关的修改
  示例：`chore: update Maven plugin versions`
- **perf**：性能优化
  示例：`perf: improve query efficiency with index`
- **ci**：CI/CD 配置相关修改
  示例：`ci: add GitHub Actions build workflow`
- **build**：构建系统或依赖管理的更改
  示例：`build: upgrade Spring Boot to 3.4.0`
- **revert**：回滚之前的提交
  示例：`revert: revert "feat: add comment API"`

## 新建远程仓库

新建远程仓库 `spring-boot-course`，不用添加任何文件。

## 本地推送远程

假设远程仓库地址是 `git@github.com:你的用户名/spring-boot-course.git`：

```javascript
# 添加远程仓库（origin 是别名）
git remote add origin git@github.com:你的用户名/spring-boot-course.git

# 推送到远程仓库 main 分支（如果远程是 master，请改成 master）
git push -u origin main
```

## 几点说明

- `git init` 会在当前目录创建 `.git` 目录，表示这是一个仓库。
- `git add .` 表示追踪当前目录下的所有文件。
- `git commit -m "message"` 把暂存的文件保存到历史记录。
- `git remote add origin ...` 绑定远程仓库地址，`origin` 是常用别名。
- `git push -u origin main` 第一次推送时加 `-u`，以后只用 `git push` 即可。

 