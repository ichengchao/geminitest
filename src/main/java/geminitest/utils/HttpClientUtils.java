/**
// * Project: armory-core
// * <p>
// * File Created at 2010-6-18
// * $Id$
// * <p>
// * Copyright 2008 Alibaba.com Croporation Limited.
// * All rights reserved.
// * <p>
// * This software is the confidential and proprietary information of
// * Alibaba Company. ("Confidential Information").  You shall not
// * disclose such Confidential Information and shall use it only in
// * accordance with the terms of the license agreement you entered into
// * with Alibaba.com.
// */
//package geminitest.utils;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//import java.util.Map;
//
//import org.apache.http.Consts;
//import org.apache.http.client.fluent.Form;
//import org.apache.http.client.fluent.Request;
//import org.apache.http.entity.ContentType;
//
///**
// * @author charles.chengc
// */
//public class HttpClientUtils {
//
//    // private static Logger logger = Logger.getLogger(HttpClientUtil.class);
//
//    private final static int DEFAULT_TIMEOUT = 15000;
//    private final static int CONNECT_TIMEOUT = 5000;
//
//    public static String urlencode(String s) {
//        try {
//            return URLEncoder.encode(s, "utf8");
//        } catch (UnsupportedEncodingException e) {
//            // never;
//        }
//        return null;
//    }
//
//    public static String getDataAsStringFromUrl(String url) {
//        try {
//            return Request.Get(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).execute()
//                .returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//    }
//
//    public static String getDataAsStringFromUrlWithHeader(String url, Map<String, String> headerMap) {
//        try {
//            Request request = Request.Get(url);
//            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
//                request.addHeader(entry.getKey(), entry.getValue());
//            }
//            return request.connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).execute().returnContent()
//                .asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//    }
//
//    public static byte[] getDataAsByteFromUrl(String url) {
//        try {
//            return Request.Get(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).execute()
//                .returnContent().asBytes();
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//    }
//
//    public static String getDataAsStringFromUrlNoException(String url) {
//        try {
//            return Request.Get(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).execute()
//                .returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public static String postDataAsStringFromUrl(String url) {
//        try {
//            return Request.Post(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).execute()
//                .returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//    }
//
//    public static String postUrlAndStringBody(String url, String body) {
//        try {
//            return Request.Post(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT)
//                .bodyString(body, ContentType.APPLICATION_JSON).execute().returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//
//    }
//
//    public static String postUrlAndStringBody(String url, Map<String, String> formMap) {
//        try {
//            Form form = Form.form();
//            for (Map.Entry<String, String> entry : formMap.entrySet()) {
//                form.add(entry.getKey(), entry.getValue());
//            }
//            return Request.Post(url).connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT)
//                .bodyForm(form.build()).execute().returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//
//    }
//
//    public static String postUrlAndStringHeaderBody(String url, Map<String, String> headerMap,
//        Map<String, String> formMap) {
//        try {
//            Form form = Form.form();
//            for (Map.Entry<String, String> entry : formMap.entrySet()) {
//                form.add(entry.getKey(), entry.getValue());
//            }
//            Request request = Request.Post(url);
//            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
//                request.addHeader(entry.getKey(), entry.getValue());
//            }
//            return request.connectTimeout(CONNECT_TIMEOUT).socketTimeout(DEFAULT_TIMEOUT).bodyForm(form.build())
//                .execute().returnContent().asString(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        String url = "http://localhost:8080/game/logtest.htm";
//        String queryInfo = HttpClientUtils.getDataAsStringFromUrl(url);
//        System.out.println(queryInfo);
//    }
//
//}
