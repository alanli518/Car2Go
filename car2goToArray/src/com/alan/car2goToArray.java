package com.alan;

/**
 * Created by alanli on 15-10-03.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class car2goToArray {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        String[] fileName = new String[382];

        //******************************FILE LOCATIONS HAVE CHANGED********************************
        fileName[0]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:26:38.543-0400.json";
        fileName[1]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:31:40.231-0400.json";
        fileName[2]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:36:41.116-0400.json";
        fileName[3]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:41:42.346-0400.json";
        fileName[4]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:46:43.269-0400.json";
        fileName[5]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:51:44.613-0400.json";
        fileName[6]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T11:56:45.667-0400.json";
        fileName[7]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:01:47.042-0400.json";
        fileName[8]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:06:48.529-0400.json";
        fileName[9]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:11:49.509-0400.json";
        fileName[10]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:16:50.871-0400.json";
        fileName[11]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:21:51.891-0400.json";
        fileName[12]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:26:52.883-0400.json";
        fileName[13]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:31:53.787-0400.json";
        fileName[14]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:36:54.878-0400.json";
        fileName[15]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:41:55.669-0400.json";
        fileName[16]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:46:57.050-0400.json";
        fileName[17]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:51:57.813-0400.json";
        fileName[18]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T12:56:59.119-0400.json";
        fileName[19]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:02:00.271-0400.json";
        fileName[20]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:07:01.699-0400.json";
        fileName[21]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:12:02.564-0400.json";
        fileName[22]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:17:03.480-0400.json";
        fileName[23]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:22:04.341-0400.json";
        fileName[24]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:27:05.326-0400.json";
        fileName[25]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:32:06.257-0400.json";
        fileName[26]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:37:08.266-0400.json";
        fileName[27]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:42:09.674-0400.json";
        fileName[28]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:47:10.736-0400.json";
        fileName[29]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:52:12.190-0400.json";
        fileName[30]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T13:57:13.038-0400.json";
        fileName[31]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:02:14.634-0400.json";
        fileName[32]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:07:15.760-0400.json";
        fileName[33]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:12:17.037-0400.json";
        fileName[34]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:17:18.134-0400.json";
        fileName[35]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:22:19.483-0400.json";
        fileName[36]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:27:20.616-0400.json";
        fileName[37]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:32:21.958-0400.json";
        fileName[38]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:37:22.871-0400.json";
        fileName[39]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:42:23.833-0400.json";
        fileName[40]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:47:25.257-0400.json";
        fileName[41]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:52:26.468-0400.json";
        fileName[42]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T14:57:27.407-0400.json";
        fileName[43]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:02:28.501-0400.json";
        fileName[44]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:07:29.499-0400.json";
        fileName[45]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:12:30.710-0400.json";
        fileName[46]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:17:31.596-0400.json";
        fileName[47]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:22:32.656-0400.json";
        fileName[48]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:27:33.667-0400.json";
        fileName[49]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:32:34.851-0400.json";
        fileName[50]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:37:35.778-0400.json";
        fileName[51]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:42:36.856-0400.json";
        fileName[52]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:47:38.112-0400.json";
        fileName[53]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:52:39.550-0400.json";
        fileName[54]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T15:57:40.477-0400.json";
        fileName[55]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:02:41.874-0400.json";
        fileName[56]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:07:43.027-0400.json";
        fileName[57]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:12:44.388-0400.json";
        fileName[58]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:17:45.414-0400.json";
        fileName[59]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:22:46.833-0400.json";
        fileName[60]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:27:47.636-0400.json";
        fileName[61]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:32:49.061-0400.json";
        fileName[62]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:37:50.541-0400.json";
        fileName[63]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:42:51.418-0400.json";
        fileName[64]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:47:52.828-0400.json";
        fileName[65]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:52:53.696-0400.json";
        fileName[66]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T16:57:55.011-0400.json";
        fileName[67]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:02:55.808-0400.json";
        fileName[68]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:07:57.052-0400.json";
        fileName[69]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:12:57.914-0400.json";
        fileName[70]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:17:59.320-0400.json";
        fileName[71]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:23:00.751-0400.json";
        fileName[72]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:28:01.689-0400.json";
        fileName[73]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:33:02.825-0400.json";
        fileName[74]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:38:03.731-0400.json";
        fileName[75]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:43:05.120-0400.json";
        fileName[76]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:48:06.008-0400.json";
        fileName[77]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:53:07.384-0400.json";
        fileName[78]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T17:58:08.313-0400.json";
        fileName[79]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:03:09.705-0400.json";
        fileName[80]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:08:10.607-0400.json";
        fileName[81]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:13:11.768-0400.json";
        fileName[82]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:18:12.689-0400.json";
        fileName[83]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:23:13.781-0400.json";
        fileName[84]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:28:14.733-0400.json";
        fileName[85]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:33:15.817-0400.json";
        fileName[86]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:38:16.756-0400.json";
        fileName[87]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:43:18.464-0400.json";
        fileName[88]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:48:19.457-0400.json";
        fileName[89]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:53:20.956-0400.json";
        fileName[90]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T18:58:21.909-0400.json";
        fileName[91]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:03:23.329-0400.json";
        fileName[92]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:08:24.275-0400.json";
        fileName[93]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:13:25.863-0400.json";
        fileName[94]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:18:26.852-0400.json";
        fileName[95]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:23:28.190-0400.json";
        fileName[96]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:28:29.171-0400.json";
        fileName[97]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:33:30.667-0400.json";
        fileName[98]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:38:31.629-0400.json";
        fileName[99]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:43:32.951-0400.json";
        fileName[100]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:48:33.840-0400.json";
        fileName[101]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:53:35.513-0400.json";
        fileName[102]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T19:58:36.411-0400.json";
        fileName[103]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:03:37.687-0400.json";
        fileName[104]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:08:38.599-0400.json";
        fileName[105]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:13:40.063-0400.json";
        fileName[106]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:18:41.635-0400.json";
        fileName[107]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:23:42.535-0400.json";
        fileName[108]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:28:43.640-0400.json";
        fileName[109]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:33:44.988-0400.json";
        fileName[110]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:38:46.302-0400.json";
        fileName[111]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:43:47.185-0400.json";
        fileName[112]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:48:48.451-0400.json";
        fileName[113]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:53:49.564-0400.json";
        fileName[114]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T20:58:51.064-0400.json";
        fileName[115]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:03:52.077-0400.json";
        fileName[116]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:08:53.378-0400.json";
        fileName[117]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:13:54.267-0400.json";
        fileName[118]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:18:55.571-0400.json";
        fileName[119]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:23:56.456-0400.json";
        fileName[120]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:28:57.866-0400.json";
        fileName[121]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:33:58.754-0400.json";
        fileName[122]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:39:00.204-0400.json";
        fileName[123]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:44:01.682-0400.json";
        fileName[124]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:49:02.553-0400.json";
        fileName[125]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:54:03.806-0400.json";
        fileName[126]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T21:59:04.852-0400.json";
        fileName[127]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:04:06.035-0400.json";
        fileName[128]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:09:07.016-0400.json";
        fileName[129]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:14:08.600-0400.json";
        fileName[130]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:19:09.511-0400.json";
        fileName[131]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:24:11.077-0400.json";
        fileName[132]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:29:12.426-0400.json";
        fileName[133]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:34:13.984-0400.json";
        fileName[134]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:39:14.953-0400.json";
        fileName[135]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:44:16.252-0400.json";
        fileName[136]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:49:17.236-0400.json";
        fileName[137]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:54:19.065-0400.json";
        fileName[138]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T22:59:20.607-0400.json";
        fileName[139]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:04:21.779-0400.json";
        fileName[140]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:09:23.417-0400.json";
        fileName[141]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:14:24.378-0400.json";
        fileName[142]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:19:25.647-0400.json";
        fileName[143]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:24:26.612-0400.json";
        fileName[144]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:29:27.843-0400.json";
        fileName[145]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:34:28.789-0400.json";
        fileName[146]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:39:30.181-0400.json";
        fileName[147]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:44:31.105-0400.json";
        fileName[148]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:49:32.451-0400.json";
        fileName[149]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:54:33.722-0400.json";
        fileName[150]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-04T23:59:34.978-0400.json";
        fileName[151]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:04:35.912-0400.json";
        fileName[152]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:09:37.366-0400.json";
        fileName[153]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:14:38.360-0400.json";
        fileName[154]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:19:39.476-0400.json";
        fileName[155]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:24:40.536-0400.json";
        fileName[156]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:29:41.982-0400.json";
        fileName[157]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:34:42.887-0400.json";
        fileName[158]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:39:44.510-0400.json";
        fileName[159]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:44:45.362-0400.json";
        fileName[160]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:49:46.599-0400.json";
        fileName[161]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:54:47.513-0400.json";
        fileName[162]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T00:59:48.832-0400.json";
        fileName[163]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:04:49.695-0400.json";
        fileName[164]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:09:50.863-0400.json";
        fileName[165]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:14:51.732-0400.json";
        fileName[166]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:19:53.335-0400.json";
        fileName[167]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:24:54.600-0400.json";
        fileName[168]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:29:55.855-0400.json";
        fileName[169]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:34:56.996-0400.json";
        fileName[170]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:39:58.727-0400.json";
        fileName[171]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:44:59.636-0400.json";
        fileName[172]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:50:01.011-0400.json";
        fileName[173]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T01:55:01.893-0400.json";
        fileName[174]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:00:03.145-0400.json";
        fileName[175]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:05:04.022-0400.json";
        fileName[176]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:10:05.305-0400.json";
        fileName[177]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:15:06.178-0400.json";
        fileName[178]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:20:07.478-0400.json";
        fileName[179]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:25:08.384-0400.json";
        fileName[180]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:30:09.683-0400.json";
        fileName[181]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:35:10.536-0400.json";
        fileName[182]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:40:11.789-0400.json";
        fileName[183]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:45:13.651-0400.json";
        fileName[184]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:50:15.224-0400.json";
        fileName[185]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T02:55:16.420-0400.json";
        fileName[186]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:00:17.617-0400.json";
        fileName[187]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:05:18.480-0400.json";
        fileName[188]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:10:19.729-0400.json";
        fileName[189]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:15:20.839-0400.json";
        fileName[190]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:20:22.023-0400.json";
        fileName[191]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:25:22.892-0400.json";
        fileName[192]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:30:24.152-0400.json";
        fileName[193]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:35:25.264-0400.json";
        fileName[194]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:40:26.480-0400.json";
        fileName[195]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:45:27.327-0400.json";
        fileName[196]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:50:28.594-0400.json";
        fileName[197]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T03:55:29.443-0400.json";
        fileName[198]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:00:30.686-0400.json";
        fileName[199]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:05:31.626-0400.json";
        fileName[200]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:10:32.878-0400.json";
        fileName[201]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:15:34.007-0400.json";
        fileName[202]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:20:35.215-0400.json";
        fileName[203]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:25:36.225-0400.json";
        fileName[204]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:30:37.443-0400.json";
        fileName[205]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:35:38.285-0400.json";
        fileName[206]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:40:39.521-0400.json";
        fileName[207]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:45:40.508-0400.json";
        fileName[208]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:50:41.776-0400.json";
        fileName[209]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T04:55:42.607-0400.json";
        fileName[210]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:00:43.948-0400.json";
        fileName[211]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:05:44.856-0400.json";
        fileName[212]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:10:46.232-0400.json";
        fileName[213]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:15:47.060-0400.json";
        fileName[214]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:20:48.533-0400.json";
        fileName[215]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:25:49.368-0400.json";
        fileName[216]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:30:50.643-0400.json";
        fileName[217]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:35:51.770-0400.json";
        fileName[218]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:40:52.959-0400.json";
        fileName[219]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:45:53.828-0400.json";
        fileName[220]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:50:55.142-0400.json";
        fileName[221]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T05:55:56.452-0400.json";
        fileName[222]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:00:57.288-0400.json";
        fileName[223]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:05:58.482-0400.json";
        fileName[224]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:10:59.811-0400.json";
        fileName[225]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:16:01.006-0400.json";
        fileName[226]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:21:01.895-0400.json";
        fileName[227]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:26:03.181-0400.json";
        fileName[228]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:31:04.089-0400.json";
        fileName[229]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:36:05.614-0400.json";
        fileName[230]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:41:06.437-0400.json";
        fileName[231]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:46:08.018-0400.json";
        fileName[232]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:51:09.120-0400.json";
        fileName[233]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T06:56:10.396-0400.json";
        fileName[234]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:01:11.248-0400.json";
        fileName[235]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:06:12.216-0400.json";
        fileName[236]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:11:13.115-0400.json";
        fileName[237]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:16:14.340-0400.json";
        fileName[238]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:21:15.775-0400.json";
        fileName[239]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:26:16.659-0400.json";
        fileName[240]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:31:17.864-0400.json";
        fileName[241]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:36:19.170-0400.json";
        fileName[242]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:41:20.405-0400.json";
        fileName[243]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:46:21.269-0400.json";
        fileName[244]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:51:22.562-0400.json";
        fileName[245]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T07:56:23.439-0400.json";
        fileName[246]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:01:24.659-0400.json";
        fileName[247]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:06:25.786-0400.json";
        fileName[248]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:11:27.445-0400.json";
        fileName[249]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:16:28.503-0400.json";
        fileName[250]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:21:30.096-0400.json";
        fileName[251]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:26:30.992-0400.json";
        fileName[252]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:31:32.266-0400.json";
        fileName[253]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:36:33.100-0400.json";
        fileName[254]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:41:34.215-0400.json";
        fileName[255]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:46:35.117-0400.json";
        fileName[256]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:51:36.043-0400.json";
        fileName[257]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T08:56:37.661-0400.json";
        fileName[258]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:01:38.531-0400.json";
        fileName[259]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:06:39.960-0400.json";
        fileName[260]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:11:40.869-0400.json";
        fileName[261]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:16:42.076-0400.json";
        fileName[262]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:21:42.982-0400.json";
        fileName[263]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:26:44.306-0400.json";
        fileName[264]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:31:45.145-0400.json";
        fileName[265]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:36:46.405-0400.json";
        fileName[266]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:41:47.235-0400.json";
        fileName[267]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:46:48.460-0400.json";
        fileName[268]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:51:49.327-0400.json";
        fileName[269]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T09:56:50.607-0400.json";
        fileName[270]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:01:51.519-0400.json";
        fileName[271]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:06:52.514-0400.json";
        fileName[272]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:11:53.400-0400.json";
        fileName[273]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:16:54.670-0400.json";
        fileName[274]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:21:55.498-0400.json";
        fileName[275]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:26:56.679-0400.json";
        fileName[276]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:31:57.773-0400.json";
        fileName[277]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:36:59.048-0400.json";
        fileName[278]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:41:59.879-0400.json";
        fileName[279]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:47:01.389-0400.json";
        fileName[280]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:52:02.259-0400.json";
        fileName[281]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T10:57:03.686-0400.json";
        fileName[282]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:02:04.549-0400.json";
        fileName[283]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:07:05.921-0400.json";
        fileName[284]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:12:07.425-0400.json";
        fileName[285]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:17:08.652-0400.json";
        fileName[286]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:22:09.997-0400.json";
        fileName[287]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:27:10.844-0400.json";
        fileName[288]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:32:12.154-0400.json";
        fileName[289]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:37:13.045-0400.json";
        fileName[290]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:42:14.221-0400.json";
        fileName[291]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:47:15.111-0400.json";
        fileName[292]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:52:16.427-0400.json";
        fileName[293]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T11:57:17.302-0400.json";
        fileName[294]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:02:18.874-0400.json";
        fileName[295]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:07:19.723-0400.json";
        fileName[296]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:12:21.368-0400.json";
        fileName[297]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:17:22.248-0400.json";
        fileName[298]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:22:23.495-0400.json";
        fileName[299]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:27:24.360-0400.json";
        fileName[300]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:32:25.960-0400.json";
        fileName[301]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:37:26.836-0400.json";
        fileName[302]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:42:28.558-0400.json";
        fileName[303]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:47:29.421-0400.json";
        fileName[304]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:52:30.768-0400.json";
        fileName[305]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T12:57:31.692-0400.json";
        fileName[306]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:02:33.389-0400.json";
        fileName[307]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:07:34.333-0400.json";
        fileName[308]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:12:35.508-0400.json";
        fileName[309]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:17:36.393-0400.json";
        fileName[310]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:22:37.816-0400.json";
        fileName[311]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:27:39.026-0400.json";
        fileName[312]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:32:39.774-0400.json";
        fileName[313]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:37:41.310-0400.json";
        fileName[314]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:42:42.159-0400.json";
        fileName[315]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:47:43.741-0400.json";
        fileName[316]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:52:44.586-0400.json";
        fileName[317]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T13:57:45.882-0400.json";
        fileName[318]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:02:46.710-0400.json";
        fileName[319]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:07:48.210-0400.json";
        fileName[320]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:12:49.047-0400.json";
        fileName[321]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:17:50.320-0400.json";
        fileName[322]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:22:51.212-0400.json";
        fileName[323]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:27:52.470-0400.json";
        fileName[324]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:32:53.771-0400.json";
        fileName[325]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:37:54.728-0400.json";
        fileName[326]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:42:56.089-0400.json";
        fileName[327]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:47:56.956-0400.json";
        fileName[328]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:52:58.194-0400.json";
        fileName[329]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T14:57:59.201-0400.json";
        fileName[330]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:03:00.613-0400.json";
        fileName[331]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:08:01.456-0400.json";
        fileName[332]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:13:02.690-0400.json";
        fileName[333]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:18:03.532-0400.json";
        fileName[334]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:23:04.539-0400.json";
        fileName[335]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:28:05.421-0400.json";
        fileName[336]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:33:06.578-0400.json";
        fileName[337]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:38:07.402-0400.json";
        fileName[338]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:43:08.834-0400.json";
        fileName[339]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:48:09.715-0400.json";
        fileName[340]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:53:10.953-0400.json";
        fileName[341]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T15:58:11.800-0400.json";
        fileName[342]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:03:12.779-0400.json";
        fileName[343]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:08:13.652-0400.json";
        fileName[344]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:13:14.993-0400.json";
        fileName[345]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:18:16.143-0400.json";
        fileName[346]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:23:17.363-0400.json";
        fileName[347]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:28:18.281-0400.json";
        fileName[348]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:33:19.598-0400.json";
        fileName[349]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:38:20.445-0400.json";
        fileName[350]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:43:21.734-0400.json";
        fileName[351]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:48:22.629-0400.json";
        fileName[352]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:53:24.104-0400.json";
        fileName[353]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T16:58:25.733-0400.json";
        fileName[354]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:03:26.950-0400.json";
        fileName[355]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:08:27.784-0400.json";
        fileName[356]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:13:28.952-0400.json";
        fileName[357]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:18:29.812-0400.json";
        fileName[358]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:23:30.999-0400.json";
        fileName[359]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:28:31.904-0400.json";
        fileName[360]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:33:33.120-0400.json";
        fileName[361]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:38:33.991-0400.json";
        fileName[362]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:43:35.225-0400.json";
        fileName[363]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:48:36.141-0400.json";
        fileName[364]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:53:37.397-0400.json";
        fileName[365]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T17:58:38.727-0400.json";
        fileName[366]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:03:39.594-0400.json";
        fileName[367]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:08:41.184-0400.json";
        fileName[368]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:13:42.093-0400.json";
        fileName[369]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:18:43.286-0400.json";
        fileName[370]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:23:44.157-0400.json";
        fileName[371]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:28:45.561-0400.json";
        fileName[372]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:33:46.430-0400.json";
        fileName[373]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:38:48.105-0400.json";
        fileName[374]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:43:48.973-0400.json";
        fileName[375]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:48:49.985-0400.json";
        fileName[376]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:53:50.903-0400.json";
        fileName[377]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T18:58:52.184-0400.json";
        fileName[378]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T19:03:53.030-0400.json";
        fileName[379]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T19:08:54.421-0400.json";
        fileName[380]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T19:13:55.319-0400.json";
        fileName[381]="/Users/alanli/Desktop/Car2Go/Output/Toronto/2015-10-05T19:18:56.630-0400.json";

        int fileLength = fileName.length;
        int count = 0;
        String line;
        String car2goData = "";
        ArrayList gpsPoints = new ArrayList();
        JSONtoArray JtoA = new JSONtoArray();

        //360 is max number of available cars, 382 is number of data sets
        Double[][] xPos = new Double[360][382];
        Double[][] yPos = new Double[360][382];

        try {
            /**
             * This loop will loop through all 382 JSON files and:
             * 1) parse and extract the coordinates [long, lat, 0]
             * 2) put them in an array of the format {lat1, long1, 0, lat2, long2, 0, lat3, long3, 0}
             * 3) output two files: xArray.txt containing all lat coordinates and yArray.txt containing all long coordinates
             * Each file is an array 360 by 382 large.
             */
            for(int k = 0; k < fileLength; k++) {
                FileReader fileReader =
                        new FileReader(fileName[k]);

                BufferedReader bufferedReader =
                        new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    //car2goData is essentially a string containing the entire JSON file at a given timesnap
                    car2goData += line;
                }

                //gpsPoints is an ArrayList of all gps points (lat, long, and 0) inside a given timesnap JSON file
                //e.g. gpsPoint contains {lat1, long1, 0, lat2, long2, 0, lat3, long3, 0}
                gpsPoints = JtoA.getCoordinates(car2goData);

                Iterator it = gpsPoints.iterator();

                for(int j=0; j<360; j++){
                    if(it.hasNext()){
                        yPos[j][k] = (Double)it.next();
                        xPos[j][k] = (Double)it.next();
                        it.next(); //this skips the 0 coordinate that isn't needed
                    } else {
                        //if the given timesnap JSON file does not have the max number of 360 cars, assign 0 as coordinates
                        yPos[j][k] = 0.0;
                        xPos[j][k] = 0.0;
                    }
                }
                car2goData = "";
                bufferedReader.close();
                count += 1;
                System.out.println("LOOP      : " + count);

            }
            FileWriter file = new FileWriter("/Users/alanli/Desktop/xArray.txt");
            for(int a = 0; a < 382; a++){
                for(int b = 0; b < 360; b++){
                    file.write(xPos[b][a].toString());
                    file.write("\n");
                }
            }
            file.flush();
            file.close();

            file = new FileWriter("/Users/alanli/Desktop/yArray.txt");
            for(int a = 0; a < 382; a++){
                for(int b = 0; b < 360; b++){
                    file.write(yPos[b][a].toString());
                    file.write("\n");
                }
            }
            file.flush();
            file.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
    }
}