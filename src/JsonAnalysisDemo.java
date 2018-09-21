import com.alibaba.fastjson.JSONObject;
import dto.JsonStrDto;

public class JsonAnalysisDemo {

    public static void main(String[] args) {
        String jsonStr = "{\"status\":0,\"errorCode\":\"\",\"data\":[{\"page\":1,\"hash\":\"a0db8b27\"}," +
                "{\"page\":2,\"hash\":\"be082eec\"},{\"page\":3,\"hash\":\"65f4145e\"},{\"page\":4,\"hash\":\"b9ebea8c\"}," +
                "{\"page\":5,\"hash\":\"8c9967ab\"},{\"page\":6,\"hash\":\"1fd12f6a\"},{\"page\":7,\"hash\":\"409082ea\"}," +
                "{\"page\":8,\"hash\":\"f6445e5b\"},{\"page\":9,\"hash\":\"766946c3\"},{\"page\":10,\"hash\":\"554d75aa\"}," +
                "{\"page\":11,\"hash\":\"a7e054f4\"},{\"page\":12,\"hash\":\"99137d93\"},{\"page\":13,\"hash\":\"5b245cb0\"}" +
                ",{\"page\":14,\"hash\":\"b1b0a5f7\"},{\"page\":15,\"hash\":\"05d3511a\"},{\"page\":16,\"hash\":\"be9f56ff\"}," +
                "{\"page\":17,\"hash\":\"e4990191\"},{\"page\":18,\"hash\":\"e57118a5\"},{\"page\":19,\"hash\":\"fce92f14\"}," +
                "{\"page\":20,\"hash\":\"e6ffb093\"},{\"page\":21,\"hash\":\"89b4092c\"},{\"page\":22,\"hash\":\"2aff3cc3\"}," +
                "{\"page\":23,\"hash\":\"76301b0c\"},{\"page\":24,\"hash\":\"94d148ca\"},{\"page\":25,\"hash\":\"f445d21c\"}," +
                "{\"page\":26,\"hash\":\"44ccb393\"},{\"page\":27,\"hash\":\"536eb7a2\"},{\"page\":28,\"hash\":\"0aa06ae1\"}," +
                "{\"page\":29,\"hash\":\"7ab1fb64\"},{\"page\":30,\"hash\":\"3e5198a0\"},{\"page\":31,\"hash\":\"848c9017\"}," +
                "{\"page\":32,\"hash\":\"162fa0fd\"},{\"page\":33,\"hash\":\"10c7bb8e\"},{\"page\":34,\"hash\":\"b6ba9817\"}," +
                "{\"page\":35,\"hash\":\"c7b7a600\"},{\"page\":36,\"hash\":\"f038fee7\"},{\"page\":37,\"hash\":\"15afc456\"}," +
                "{\"page\":38,\"hash\":\"499b813a\"},{\"page\":39,\"hash\":\"7af9f8cf\"},{\"page\":40,\"hash\":\"b4810b8f\"}," +
                "{\"page\":41,\"hash\":\"a3951ed8\"},{\"page\":42,\"hash\":\"b94d7d0b\"},{\"page\":43,\"hash\":\"cdafa0ab\"}," +
                "{\"page\":44,\"hash\":\"54b0fd4a\"},{\"page\":45,\"hash\":\"2629f89a\"},{\"page\":46,\"hash\":\"dccba37a\"}," +
                "{\"page\":47,\"hash\":\"e5d83ce6\"},{\"page\":48,\"hash\":\"35a38c79\"},{\"page\":49,\"hash\":\"18b70db6\"}" +
                ",{\"page\":50,\"hash\":\"a6195a00\"},{\"page\":51,\"hash\":\"d7b283e9\"},{\"page\":52,\"hash\":\"71e6835f\"}," +
                "{\"page\":53,\"hash\":\"59bcce29\"},{\"page\":54,\"hash\":\"7af74fd3\"},{\"page\":55,\"hash\":\"61dd19d3\"}," +
                "{\"page\":56,\"hash\":\"4ae654a1\"},{\"page\":57,\"hash\":\"c224dda8\"},{\"page\":58,\"hash\":\"325d6d8f\"}," +
                "{\"page\":59,\"hash\":\"188717e9\"},{\"page\":60,\"hash\":\"18645200\"},{\"page\":61,\"hash\":\"b170fdd8\"}," +
                "{\"page\":62,\"hash\":\"08e00417\"},{\"page\":63,\"hash\":\"1f032d03\"},{\"page\":64,\"hash\":\"310cd18b\"}," +
                "{\"page\":65,\"hash\":\"1cbb10a2\"},{\"page\":66,\"hash\":\"7247c6a9\"},{\"page\":67,\"hash\":\"84f2d782\"}," +
                "{\"page\":68,\"hash\":\"bbc24e99\"}]}";
        JsonStrDto jsonStrDto = JSONObject.parseObject(jsonStr, JsonStrDto.class);
        System.out.println("------------status---------------");
        System.out.println(jsonStrDto.getStatus());
        System.out.println("------------errorCode---------------");
        System.out.println(jsonStrDto.getErrorCode());
        System.out.println("------------data的数据长度---------------");
        System.out.println(jsonStrDto.getData().size());
        System.out.println("------------data的详细数据内容---------------");
        System.out.println(jsonStrDto.getData());

    }
}
