package com.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.javafx.collections.MappingChange;

import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        String json="[{\n" +
                "          \"key\" : \"006781c3c0124d1ba2abd16768a239fe\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"01689217e382c553f8c2addbc1d1550d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"04e28c23fc892e8e85fd16651e027b6c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"08d7e29f90f23b34a94283c3313d250f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"0964c04223f22cfbf3c7b7c64dbeb03c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1263b9846b5a23342d77f3d1b368ef70\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"12aadf4cc42d446a99ea8bec22af1d81\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1452266e978e94793c7a8bcd43578f14\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"162bd8168e78f9f2bf9361194f1fcbc8\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"18883a104943eed60a8c02cc854a5648\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1ab9c688dcaca0f6baa11a26b1750963\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1c17bbd8c0811659b2586e35efa4d3cd\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1cb353032591904eabc63dc269a69253\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1db4a6c36cfd804b45f55e62ecc93be1\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1db5eb1d8ab72f7e8088fdf7e83dfd74\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"1ea5858d80cef7a95aea70c16a35ff97\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"23fc72aeea0448b89cddd5ba19ea4e18\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"24f6bd16e492db6683220d0654098974\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"27c6f0c86a03445f569c684a12d4d169\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"280e9d7982ef464186f047a13236d158\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2983e19211115ba1699cf8b68fc0e384\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2a9018316376c1d04d6792a886984744\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2c7e95d0d02346be8bdcbaf06f2ad6d3\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2ccaf5a3756fe8b68416b058f7304747\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2d2128863e6aa75f5bc6a6c481df32d4\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"2fd8b45d35e1855bc1443f8b59de12ee\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"325af8308d35679e111e536fe094161e\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"32c6a8ca6e334b5aad584fe9cc949ec2\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"3572ba0454245e91c7374dcb7d401a70\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"358dc0c180fe79024f8353a05d58f58f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"38c76d8194d68871d3c019e6d427c25f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"3909806ccf60ca276626f0ac10e3120b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"39cb3e9cde960d359bfa521d335bdf7b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"39dc5cc1dba946cb94770c298740b3e9\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"3b3086b02ebae824b44cc3c125f1d27b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"3cacbd93e312bd2cb610fe56bcadee06\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"3f5cbf75f3829be9ae100b80f0b2daf4\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"46db2b46dad0d3fb0b8d76e4b5ac8f04\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"4d55953dd83a3d2c50c4637218c00b17\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"4e0ed0cb9722fe6f36a5b9c8c2bceb48\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"58859e00f25f6906edd347a8477fa4b5\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"594f8f10a218f0c0402e5f0621973a0d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"60888e2b6c62a90db2092c8070dc8fb3\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"61b6c513366a82c449328cfb9f8a52d3\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"630e92bf3f95c1e319a83136cba41383\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"672767b9d5685a56e34514a6414132fb\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"6d39459c3ac52f7ee21edb4447ab6a89\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"70f046b0929c7d2b736817088e009d3f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"7246a366c5360e55bfab98e00338928b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"72b9c7ec5d20c5bd3ecbe8d85ca35a15\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"72dd2006bfd47389fc732bd7f06f731f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"75224591ec69588512587c317ad016b9\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"7782e8106eeb2680ba61f6da1b4e17ef\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"781a1a495d9bf29e0678deab441ec218\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"79b4b9f51ebbce27426a9ed19a4cb768\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"7b49f40814564c10870c6b1ab9da4025\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"7cfab464b4cb5b46b9253dba0aeec1e0\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"7f5b34f6815cf9ffa90b304a1b78eb4f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"82071390b3368e164962e0735ecd52ed\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"82d8820fe7034a4191268e0dee7fbaef\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"84188cc34c927621c62bff36e397a38c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"86ac6343a231dc285e1e5ff4426d624e\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"8cb8edee6ee35601712173b4630af1ba\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"8cbc38e181912a506749f5064ce687f5\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"902b2d76a4194f9cb64ae1e9edc04bae\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"92c6cf0303d53da7524e0d8fb809c530\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"94a9e49502e9f4c874da2a274a98b799\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"95ecbda4200e9710f15f2ce86b55a0c1\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"96c3f5ca282a42ac8d1ebb134524a7cf\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"9e8f5f0afdb2efe9846c8c86cbb0fc9b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"a013620a258a962b3a9e651c11e2ed3a\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"a142e25b1c594f1ab0647ab478e18b78\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"a547c02eef1a292b459078ba9c425b66\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"a61f3341c3daab9d080c68732d7d100b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"abc6351df069799cd88aa421cdfc13d1\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ae332912cd9e68200cd18fb1194acdd1\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ae45bb67d4f5e2b0338368ea68a5d101\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"aee558cf804d410896a181b29d74856b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"b0bb269ac1ae129bd0d087ba2b4ed521\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"b610363c689efe50f3ec70bdcd2cbf0b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"b7774a0347445d0a530afc8a74eeac24\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"b9299d773b216e0dda2f512c89097c6c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ba3ac6a2d2a558b42e2676c78608090b\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"bb32fb0543d9e74cd36f93c4eac993cd\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"bd0430cd50edcd38abce7b77b4e294a8\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"bd2d855003606925427d2345d914a94d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"c5b0d787f78146fa853b8c0733e238c2\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"c65f4d1c252074e5673e0cdfdf36ca61\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"c6a80dff46489ca330d7964532dfb5a6\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"c8a9faceafae9753085164b1835fc73c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"cb9e0da724a60085f16f8d4833d15285\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ce08d0fca047e25785bb403a74071758\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"cfaf5b893d17410e9207f046ff314793\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"d040bac709e24a719a348fe79658d6ef\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"d0d5f9bb31f6db49c87c06fa86895609\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"d494b43942224b9d8ae53515d391c6c1\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"d6d5a91dd56aba1b209060972ed3145f\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"d85b625e09f9620c4e522182dc0c9956\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"dc4f1071a75cfb6c47c820e3dceb6db4\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ddd2e2d1fe5183f5514ff536e77f735d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"dff8c155c9a40b7f608fdf0a0e44b242\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"e32bc1ac1fdc51cc31dcd0c67e45f6d4\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"e69cb718ceebe34a65905f78ccca30cd\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"e6f2982096a30b4a80c7025143d173be\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"e72a5f009e892528648e936bfe5f70df\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ea7dd158bd284d90db476926911d6f5c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"ed4fa74df81ed0c7a2de68e3c23f063e\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"f0368adfb9b617151e2e99701cf5202d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"f18250c63c954fc39a226e10f9c7909c\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"f4d07b2398a9dd380865b17ee6f05ac6\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"f7323d9ed3b379cdd972b77f109f990d\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"f93532563fc5c84d8ed3bf0a4b3995eb\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"fa3e550dff0323fa932122da7936b8d2\",\n" +
                "          \"doc_count\" : 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"key\" : \"fe9e28e03cbf4e23efed69a8e0712868\",\n" +
                "          \"doc_count\" : 6\n" +
                "        }]";
        List<Map<String,Object>> list=(List)JSONArray.parseArray(json, Map.class);
        System.err.println(list.size());
        for(Map<String,Object> d:list){
            System.out.println(d.get("key"));
        }
    }
}
