# OpenAPI definition


**Description**:OpenAPI definition


**HOST**:http://127.0.0.1:9101


**Contacts**:


**Version**:v0


**URL**:/mevande_auth/v3/api-docs/default


[TOC]






# account-feign-controller


## update


**url**:`/mevande_auth/feign/account`


**method**:`PUT`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "username": "",
  "password": "",
  "createIp": "",
  "status": 0,
  "sysType": 0,
  "userId": 0,
  "tenantId": 0,
  "isAdmin": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|authAccountDTO|AuthAccountDTO|body|true|AuthAccountDTO|AuthAccountDTO|
|&emsp;&emsp;username|||true|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;createIp|||false|string||
|&emsp;&emsp;status|||true|integer(int32)||
|&emsp;&emsp;sysType|||true|integer(int32)||
|&emsp;&emsp;userId|||true|integer(int64)||
|&emsp;&emsp;tenantId|||true|integer(int64)||
|&emsp;&emsp;isAdmin|||true|integer(int32)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityVoid|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||object||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {},
	"success": true
}
```


## deleteByUserIdAndSysType


**url**:`/mevande_auth/feign/account/deleteByUserIdAndSysType`


**method**:`DELETE`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||query|true|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityVoid|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||object||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {},
	"success": true
}
```


## getByUserIdAndSysType


**url**:`/mevande_auth/feign/account/getByUserIdAndSysType`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||query|true|integer(int64)||
|sysType||query|true|integer(int32)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityAuthAccountVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||AuthAccountVO|AuthAccountVO|
|&emsp;&emsp;uid||integer(int64)||
|&emsp;&emsp;userId|用户id|integer(int64)||
|&emsp;&emsp;username|用户名|string||
|&emsp;&emsp;status|状态 1:启用 0:禁用 -1:删除|integer(int32)||
|&emsp;&emsp;createIp|创建ip|string||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"uid": 0,
		"userId": 0,
		"username": "",
		"status": 0,
		"createIp": ""
	},
	"success": true
}
```


## updateAuthAccountStatus


**url**:`/mevande_auth/feign/account/status`


**method**:`PUT`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "username": "",
  "password": "",
  "createIp": "",
  "status": 0,
  "sysType": 0,
  "userId": 0,
  "tenantId": 0,
  "isAdmin": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|authAccountDTO|AuthAccountDTO|body|true|AuthAccountDTO|AuthAccountDTO|
|&emsp;&emsp;username|||true|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;createIp|||false|string||
|&emsp;&emsp;status|||true|integer(int32)||
|&emsp;&emsp;sysType|||true|integer(int32)||
|&emsp;&emsp;userId|||true|integer(int64)||
|&emsp;&emsp;tenantId|||true|integer(int64)||
|&emsp;&emsp;isAdmin|||true|integer(int32)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityVoid|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||object||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {},
	"success": true
}
```


## save


**url**:`/mevande_auth/feign/insider/account`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "username": "",
  "password": "",
  "createIp": "",
  "status": 0,
  "sysType": 0,
  "userId": 0,
  "tenantId": 0,
  "isAdmin": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|authAccountDTO|AuthAccountDTO|body|true|AuthAccountDTO|AuthAccountDTO|
|&emsp;&emsp;username|||true|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;createIp|||false|string||
|&emsp;&emsp;status|||true|integer(int32)||
|&emsp;&emsp;sysType|||true|integer(int32)||
|&emsp;&emsp;userId|||true|integer(int64)||
|&emsp;&emsp;tenantId|||true|integer(int64)||
|&emsp;&emsp;isAdmin|||true|integer(int32)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityLong|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||integer(int64)|integer(int64)|
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": 0,
	"success": true
}
```


## getMerchantInfoByTenantId


**url**:`/mevande_auth/feign/insider/account/getMerchantInfoByTenantId`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|tenantId||query|true|integer(int64)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityAuthAccountVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||AuthAccountVO|AuthAccountVO|
|&emsp;&emsp;uid||integer(int64)||
|&emsp;&emsp;userId|用户id|integer(int64)||
|&emsp;&emsp;username|用户名|string||
|&emsp;&emsp;status|状态 1:启用 0:禁用 -1:删除|integer(int32)||
|&emsp;&emsp;createIp|创建ip|string||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"uid": 0,
		"userId": 0,
		"username": "",
		"status": 0,
		"createIp": ""
	},
	"success": true
}
```


## updateUserInfoByUserIdAndSysType


**url**:`/mevande_auth/feign/insider/accout/updateTenantIdByUserIdAndSysType`


**method**:`PUT`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "userId": 0,
  "uid": 0,
  "tenantId": 0,
  "sysType": 0,
  "isAdmin": 0,
  "bizUserId": "",
  "bizUid": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||query|true|integer(int64)||
|sysType||query|true|integer(int32)||
|userInfoInTokenBO|UserInfoInTokenBO|body|true|UserInfoInTokenBO|UserInfoInTokenBO|
|&emsp;&emsp;userId|||false|integer(int64)||
|&emsp;&emsp;uid|||false|integer(int64)||
|&emsp;&emsp;tenantId|||false|integer(int64)||
|&emsp;&emsp;sysType|||false|integer(int32)||
|&emsp;&emsp;isAdmin|||false|integer(int32)||
|&emsp;&emsp;bizUserId|||false|string||
|&emsp;&emsp;bizUid|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityVoid|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||object||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {},
	"success": true
}
```


## getByUsernameAndSysType


**url**:`/mevande_auth/feign/insider/getByUsernameAndSysType`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userName||query|true|string||
|sysType|Avalible:ORDINARY,MULTISHOP,PLATFORM|query|true|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityAuthAccountVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||AuthAccountVO|AuthAccountVO|
|&emsp;&emsp;uid||integer(int64)||
|&emsp;&emsp;userId|用户id|integer(int64)||
|&emsp;&emsp;username|用户名|string||
|&emsp;&emsp;status|状态 1:启用 0:禁用 -1:删除|integer(int32)||
|&emsp;&emsp;createIp|创建ip|string||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"uid": 0,
		"userId": 0,
		"username": "",
		"status": 0,
		"createIp": ""
	},
	"success": true
}
```


## storeTokenAndGetVo


**url**:`/mevande_auth/feign/insider/storeTokenAndGetVo`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "userId": 0,
  "uid": 0,
  "tenantId": 0,
  "sysType": 0,
  "isAdmin": 0,
  "bizUserId": "",
  "bizUid": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userInfoInTokenBO|UserInfoInTokenBO|body|true|UserInfoInTokenBO|UserInfoInTokenBO|
|&emsp;&emsp;userId|||false|integer(int64)||
|&emsp;&emsp;uid|||false|integer(int64)||
|&emsp;&emsp;tenantId|||false|integer(int64)||
|&emsp;&emsp;sysType|||false|integer(int32)||
|&emsp;&emsp;isAdmin|||false|integer(int32)||
|&emsp;&emsp;bizUserId|||false|string||
|&emsp;&emsp;bizUid|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityTokenInfoVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||TokenInfoVO|TokenInfoVO|
|&emsp;&emsp;accessToken|accessToken|string||
|&emsp;&emsp;refreshToken|refreshToken|string||
|&emsp;&emsp;expiresIn|在多少秒后过期|integer(int32)||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"accessToken": "",
		"refreshToken": "",
		"expiresIn": 0
	},
	"success": true
}
```


# token


## refreshToken


**url**:`/mevande_auth/ua/token/refresh`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "refreshToken": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|refreshTokenDTO|RefreshTokenDTO|body|true|RefreshTokenDTO|RefreshTokenDTO|
|&emsp;&emsp;refreshToken|refreshToken||true|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityTokenInfoVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||TokenInfoVO|TokenInfoVO|
|&emsp;&emsp;accessToken|accessToken|string||
|&emsp;&emsp;refreshToken|refreshToken|string||
|&emsp;&emsp;expiresIn|在多少秒后过期|integer(int32)||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"accessToken": "",
		"refreshToken": "",
		"expiresIn": 0
	},
	"success": true
}
```


# token-feign-controller


## checkToken


**url**:`/mevande_auth/feign/token/checkToken`


**method**:`GET`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|accessToken||query|true|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityUserInfoInTokenBO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||UserInfoInTokenBO|UserInfoInTokenBO|
|&emsp;&emsp;userId||integer(int64)||
|&emsp;&emsp;uid||integer(int64)||
|&emsp;&emsp;tenantId||integer(int64)||
|&emsp;&emsp;sysType||integer(int32)||
|&emsp;&emsp;isAdmin||integer(int32)||
|&emsp;&emsp;bizUserId||string||
|&emsp;&emsp;bizUid||string||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"userId": 0,
		"uid": 0,
		"tenantId": 0,
		"sysType": 0,
		"isAdmin": 0,
		"bizUserId": "",
		"bizUid": ""
	},
	"success": true
}
```


# 密码


## 更新密码


**url**:`/mevande_auth/update_password`


**method**:`PUT`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:<p>更新当前用户的密码, 更新密码之后要退出登录，清理token</p>



**Example**:


```javascript
{
  "oldPassword": "",
  "newPassword": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|updatePasswordDTO|UpdatePasswordDTO|body|true|UpdatePasswordDTO|UpdatePasswordDTO|
|&emsp;&emsp;oldPassword|旧密码||true|string||
|&emsp;&emsp;newPassword|新密码||true|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityTokenInfoVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||TokenInfoVO|TokenInfoVO|
|&emsp;&emsp;accessToken|accessToken|string||
|&emsp;&emsp;refreshToken|refreshToken|string||
|&emsp;&emsp;expiresIn|在多少秒后过期|integer(int32)||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"accessToken": "",
		"refreshToken": "",
		"expiresIn": 0
	},
	"success": true
}
```


# 登录


## 退出登陆


**url**:`/mevande_auth/login_out`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded`


**consumes**:`*/*`


**Note**:<p>点击退出登陆，清除token，清除菜单缓存</p>



**Params**:


暂无


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityTokenInfoVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||TokenInfoVO|TokenInfoVO|
|&emsp;&emsp;accessToken|accessToken|string||
|&emsp;&emsp;refreshToken|refreshToken|string||
|&emsp;&emsp;expiresIn|在多少秒后过期|integer(int32)||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"accessToken": "",
		"refreshToken": "",
		"expiresIn": 0
	},
	"success": true
}
```


## 账号密码


**url**:`/mevande_auth/ua/login`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:<p>通过账号登录，还要携带用户的类型，也就是用户所在的系统</p>



**Example**:


```javascript
{
  "principal": "",
  "credentials": "",
  "sysType": 0
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|authenticationDTO|AuthenticationDTO|body|true|AuthenticationDTO|AuthenticationDTO|
|&emsp;&emsp;principal|用户名||true|string||
|&emsp;&emsp;credentials|一般用作密码||true|string||
|&emsp;&emsp;sysType|系统类型 0.普通用户系统 1.商家端||true|integer(int32)||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityTokenInfoVO|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||TokenInfoVO|TokenInfoVO|
|&emsp;&emsp;accessToken|accessToken|string||
|&emsp;&emsp;refreshToken|refreshToken|string||
|&emsp;&emsp;expiresIn|在多少秒后过期|integer(int32)||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"accessToken": "",
		"refreshToken": "",
		"expiresIn": 0
	},
	"success": true
}
```


# 验证码


## check


**url**:`/mevande_auth/ua/captcha/check`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "captchaId": "",
  "projectCode": "",
  "captchaType": "",
  "captchaOriginalPath": "",
  "captchaFontType": "",
  "captchaFontSize": 0,
  "secretKey": "",
  "originalImageBase64": "",
  "point": {
    "secretKey": "",
    "x": 0,
    "y": 0
  },
  "jigsawImageBase64": "",
  "wordList": [],
  "pointList": [
    {
      "x": 0,
      "y": 0
    }
  ],
  "pointJson": "",
  "token": "",
  "result": true,
  "captchaVerification": "",
  "clientUid": "",
  "ts": 0,
  "browserInfo": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|captchaVO|CaptchaVO|body|true|CaptchaVO|CaptchaVO|
|&emsp;&emsp;captchaId|||false|string||
|&emsp;&emsp;projectCode|||false|string||
|&emsp;&emsp;captchaType|||false|string||
|&emsp;&emsp;captchaOriginalPath|||false|string||
|&emsp;&emsp;captchaFontType|||false|string||
|&emsp;&emsp;captchaFontSize|||false|integer(int32)||
|&emsp;&emsp;secretKey|||false|string||
|&emsp;&emsp;originalImageBase64|||false|string||
|&emsp;&emsp;point|||false|PointVO|PointVO|
|&emsp;&emsp;&emsp;&emsp;secretKey|||false|string||
|&emsp;&emsp;&emsp;&emsp;x|||false|integer||
|&emsp;&emsp;&emsp;&emsp;y|||false|integer||
|&emsp;&emsp;jigsawImageBase64|||false|string||
|&emsp;&emsp;wordList|||false|array|string|
|&emsp;&emsp;pointList|||false|array|object|
|&emsp;&emsp;pointJson|||false|string||
|&emsp;&emsp;token|||false|string||
|&emsp;&emsp;result|||false|boolean||
|&emsp;&emsp;captchaVerification|||false|string||
|&emsp;&emsp;clientUid|||false|string||
|&emsp;&emsp;ts|||false|integer(int64)||
|&emsp;&emsp;browserInfo|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityResponseModel|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||ResponseModel|ResponseModel|
|&emsp;&emsp;repCode||string||
|&emsp;&emsp;repMsg||string||
|&emsp;&emsp;repData||object||
|&emsp;&emsp;repCodeEnum|Avalible:SUCCESS,ERROR,EXCEPTION,BLANK_ERROR,NULL_ERROR,NOT_NULL_ERROR,NOT_EXIST_ERROR,EXIST_ERROR,PARAM_TYPE_ERROR,PARAM_FORMAT_ERROR,API_CAPTCHA_INVALID,API_CAPTCHA_COORDINATE_ERROR,API_CAPTCHA_ERROR,API_CAPTCHA_BASEMAP_NULL,API_REQ_LIMIT_GET_ERROR,API_REQ_INVALID,API_REQ_LOCK_GET_ERROR,API_REQ_LIMIT_CHECK_ERROR,API_REQ_LIMIT_VERIFY_ERROR|string||
|&emsp;&emsp;success||boolean||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"repCode": "",
		"repMsg": "",
		"repData": {},
		"repCodeEnum": "",
		"success": true
	},
	"success": true
}
```


## get


**url**:`/mevande_auth/ua/captcha/get`


**method**:`POST`


**produces**:`application/x-www-form-urlencoded,application/json`


**consumes**:`*/*`


**Note**:


**Example**:


```javascript
{
  "captchaId": "",
  "projectCode": "",
  "captchaType": "",
  "captchaOriginalPath": "",
  "captchaFontType": "",
  "captchaFontSize": 0,
  "secretKey": "",
  "originalImageBase64": "",
  "point": {
    "secretKey": "",
    "x": 0,
    "y": 0
  },
  "jigsawImageBase64": "",
  "wordList": [],
  "pointList": [
    {
      "x": 0,
      "y": 0
    }
  ],
  "pointJson": "",
  "token": "",
  "result": true,
  "captchaVerification": "",
  "clientUid": "",
  "ts": 0,
  "browserInfo": ""
}
```


**Params**:


| name | description | in    | require | type | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|captchaVO|CaptchaVO|body|true|CaptchaVO|CaptchaVO|
|&emsp;&emsp;captchaId|||false|string||
|&emsp;&emsp;projectCode|||false|string||
|&emsp;&emsp;captchaType|||false|string||
|&emsp;&emsp;captchaOriginalPath|||false|string||
|&emsp;&emsp;captchaFontType|||false|string||
|&emsp;&emsp;captchaFontSize|||false|integer(int32)||
|&emsp;&emsp;secretKey|||false|string||
|&emsp;&emsp;originalImageBase64|||false|string||
|&emsp;&emsp;point|||false|PointVO|PointVO|
|&emsp;&emsp;&emsp;&emsp;secretKey|||false|string||
|&emsp;&emsp;&emsp;&emsp;x|||false|integer||
|&emsp;&emsp;&emsp;&emsp;y|||false|integer||
|&emsp;&emsp;jigsawImageBase64|||false|string||
|&emsp;&emsp;wordList|||false|array|string|
|&emsp;&emsp;pointList|||false|array|object|
|&emsp;&emsp;pointJson|||false|string||
|&emsp;&emsp;token|||false|string||
|&emsp;&emsp;result|||false|boolean||
|&emsp;&emsp;captchaVerification|||false|string||
|&emsp;&emsp;clientUid|||false|string||
|&emsp;&emsp;ts|||false|integer(int64)||
|&emsp;&emsp;browserInfo|||false|string||


**Status**:


| code | description | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntityResponseModel|


**Response Params**:


| name | description | type | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|data||ResponseModel|ResponseModel|
|&emsp;&emsp;repCode||string||
|&emsp;&emsp;repMsg||string||
|&emsp;&emsp;repData||object||
|&emsp;&emsp;repCodeEnum|Avalible:SUCCESS,ERROR,EXCEPTION,BLANK_ERROR,NULL_ERROR,NOT_NULL_ERROR,NOT_EXIST_ERROR,EXIST_ERROR,PARAM_TYPE_ERROR,PARAM_FORMAT_ERROR,API_CAPTCHA_INVALID,API_CAPTCHA_COORDINATE_ERROR,API_CAPTCHA_ERROR,API_CAPTCHA_BASEMAP_NULL,API_REQ_LIMIT_GET_ERROR,API_REQ_INVALID,API_REQ_LOCK_GET_ERROR,API_REQ_LIMIT_CHECK_ERROR,API_REQ_LIMIT_VERIFY_ERROR|string||
|&emsp;&emsp;success||boolean||
|success||boolean||


**Response Example**:
```javascript
{
	"code": "",
	"msg": "",
	"data": {
		"repCode": "",
		"repMsg": "",
		"repData": {},
		"repCodeEnum": "",
		"success": true
	},
	"success": true
}
```