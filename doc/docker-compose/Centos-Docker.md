## Centos安装 Docker

从 2017 年 3 月开始 docker 在原来的基础上分为两个分支版本: Docker CE 和 Docker EE。

Docker CE 即社区免费版，Docker EE 即企业版，强调安全，但需付费使用。

本文介绍 Docker CE 的安装使用。

移除旧的版本：

```shell
sudo yum remove docker \
                  docker-client \
                  docker-client-latest \
                  docker-common \
                  docker-latest \
                  docker-latest-logrotate \
                  docker-logrotate \
                  docker-selinux \
                  docker-engine-selinux \
                  docker-engine
```

安装一些必要的系统工具：

```shell
sudo yum install -y yum-utils device-mapper-persistent-data lvm2
```

添加软件源信息：

```shell
sudo yum-config-manager --add-repo http://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo
```

更新 yum 缓存：

```shell
# centos 7
sudo yum makecache fast
# CentOS 8没有fast这个命令
sudo yum makecache
```

安装 Docker-ce：

```shell
sudo yum -y install docker
```

查看已安装docker版本

```shell
docker version
```

启动 Docker 后台服务

```shell
sudo systemctl start docker
```

开机启动

```shell
sudo systemctl enable docker
```


## 镜像加速

鉴于国内网络问题，后续拉取 Docker 镜像十分缓慢，我们可以需要配置加速器来解决。

可以使用阿里云的docker镜像地址：https://7qyk8phi.mirror.aliyuncs.com

新版的 Docker 使用 `/etc/docker/daemon.json`（Linux，没有请新建）。

请在该配置文件中加入：

（没有该文件的话，请先建一个）

```json
{
  "registry-mirrors": ["https://7qyk8phi.mirror.aliyuncs.com"]
}
```

重启docker

```shell
sudo systemctl daemon-reload
sudo systemctl restart docker
```

### 检查加速器是否生效

配置加速器之后，如果拉取镜像仍然十分缓慢，请手动检查加速器配置是否生效，在命令行执行 `docker info`，如果从结果中看到了如下内容，说明配置成功。

```shell
Registry Mirrors:
 https://7qyk8phi.mirror.aliyuncs.com/
```

### 下载docker-compose

```shell
#运行此命令以下载 Docker Compose 的当前稳定版本
sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
#对二进制文件应用可执行权限
sudo chmod +x /usr/local/bin/docker-compose
#测试安装
docker-compose --version
#若有docker-compose version 1.29.2, build 5becea4c，则安装成功
```
## For ubuntu distribution
``` shell
sudo apt update
sudo apt install apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
echo "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu focal stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt update
sudo apt install docker-ce docker-ce-cli containerd.io

sudo curl -fsSL https://github.com/docker/compose/releases/latest/download/docker-compose-Linux-x86_64 -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker --version
docker-compose --version

sudo systemctl start docker
sudo systemctl restart docker
sudo systemctl reload docker

```
chmod 440 /etc/sudoers
```shell
cd /docker-compose
```shell
cd /docker-compose
sudo chmod -R 777 ./rocketmq/broker/logs
sudo chmod -R 777 ./rocketmq/broker/store
sudo chmod -R 666 ./minio/data
sudo chmod -R 777 ./elasticsearch/data
docker-compose up -d --build
docker ps
```


## For debian distribution

```shell
sudo apt update
sudo apt install -y apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://download.docker.com/linux/debian/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
sudo apt install -y gnupg
sudo curl -fsSL https://download.docker.com/linux/debian/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
echo "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/debian $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io

sudo curl -fsSL https://github.com/docker/compose/releases/latest/download/docker-compose-Linux-x86_64 -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker --version
docker-compose --version

sudo systemctl start docker
sudo systemctl restart docker
sudo systemctl reload docker

```

``` 
chown root:root /etc/sudo.conf
chmod 644 /etc/sudo.conf
chown root:root /usr/lib/sudo/sudoers.so
chmod 755 /usr/lib/sudo/sudoers.so
```

``` 
chmod 440 /etc/sudoers
```
cd /docker-compose
```
cd /docker-compose
sudo chmod -R 777 ./rocketmq/broker/logs
sudo chmod -R 777 ./rocketmq/broker/store
sudo chmod -R 666 ./minio/data
sudo chmod -R 777 ./elasticsearch/data
docker-compose up -d --build
docker ps
```

``` 
apt update
apt install -y apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://download.docker.com/linux/debian/gpg | gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
apt install -y gnupg
curl -fsSL https://download.docker.com/linux/debian/gpg | gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
echo "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/debian $(lsb_release -cs) stable" | tee /etc/apt/sources.list.d/docker.list > /dev/null
apt update
apt install -y docker-ce docker-ce-cli containerd.io

curl -fsSL https://github.com/docker/compose/releases/latest/download/docker-compose-Linux-x86_64 -o /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose
docker --version
docker-compose --version

systemctl start docker
systemctl restart docker
systemctl reload docker

chown root:root /etc/sudo.conf
chmod 644 /etc/sudo.conf
chown root:root /usr/lib/sudo/sudoers.so
chmod 755 /usr/lib/sudo/sudoers.so

chmod 440 /etc/sudoers

```
remove containers
``` 
docker stop $(docker ps -aq)
docker rm  $(docker ps -aq)
```