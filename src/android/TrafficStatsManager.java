package io.cozy.trafficstats;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.util.Log;

import android.net.TrafficStats;


public class TrafficStatsManager extends CordovaPlugin {

    int appUid;

    public TrafficStatsManager() {
        appUid = cordova.getActivity().getApplicationInfo().uid;

    }

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action            The action to execute.
     * @param args              JSONArray of arguments for the plugin.
     * @param callbackContext   The callback context used when calling back into JavaScript.
     * @return                  True if the action was valid, false otherwise.
     */
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {


        //clearThreadStatsTag()

        //Return number of bytes received across mobile networks since device boot.
        if (action.equals("getMobileRxBytes")) {
            // CallbackContext::success doesn't handle long ; so we use String,
            // (int) isn't a solution, has 5GB is a realistic value
            // (and exceed int 2G capacity
            callbackContext.success(String.valueOf(TrafficStats.getMobileRxBytes()));
        //Return number of packets received across mobile networks since device boot.
        } else if (action.equals("getMobileRxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getMobileRxPackets()));
        //Return number of bytes transmitted across mobile networks since device boot.
        } else if (action.equals("getMobileTxBytes")) {
            callbackContext.success(String.valueOf(TrafficStats.getMobileTxBytes()));

        //Return number of packets transmitted across mobile networks since device boot.
        } else if (action.equals("getMobileTxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getMobileTxPackets()));
        //Get the active tag used when accounting Socket traffic originating from the current thread.
        } else if (action.equals("getThreadStatsTag")) {
            callbackContext.success(String.valueOf(TrafficStats.getThreadStatsTag()));
        //Return number of bytes received since device boot.
        } else if (action.equals("getTotalRxBytes")) {
            callbackContext.success(String.valueOf(TrafficStats.getTotalRxBytes()));
        //Return number of packets received since device boot.
        } else if (action.equals("getTotalRxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getTotalRxPackets()));
        //Return number of bytes transmitted since device boot.
        } else if (action.equals("getTotalTxBytes")) {
            callbackContext.success(String.valueOf(TrafficStats.getTotalTxBytes()));
        //Return number of packets transmitted since device boot.
        } else if (action.equals("getTotalTxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getTotalTxPackets()));

        //Return number of bytes received by the given UID since device boot.
        } else if (action.equals("getUidRxBytes")) {
            final int uid = args.getInt(0);
            callbackContext.success(String.valueOf(TrafficStats.getUidRxBytes(uid)));

        //Return number of packets received by the given UID since device boot.
        } else if (action.equals("getUidRxPackets")) {
            final int uid = args.getInt(0);
            callbackContext.success(String.valueOf(TrafficStats.getUidRxPackets(uid)));

// static long     getUidTcpRxBytes(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.

// static long     getUidTcpRxSegments(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
// static long     getUidTcpTxBytes(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
// static long     getUidTcpTxSegments(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
        // Return number of bytes transmitted by the given UID since device boot.
        } else if (action.equals("getUidTxBytes")) {
            final int uid = args.getInt(0);
            callbackContext.success(String.valueOf(TrafficStats.getUidTxBytes(uid)));

        // Return number of packets transmitted by the given UID since device boot.
        } else if (action.equals("getUidTxPackets")) {
            final int uid = args.getInt(0);
            callbackContext.success(String.valueOf(TrafficStats.getUidTxPackets(uid)));

// static long     getUidUdpRxBytes(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
// static long     getUidUdpRxPackets(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
// static long     getUidUdpTxBytes(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.
// static long     getUidUdpTxPackets(int uid)
// This method was deprecated in API level 18. Starting in JELLY_BEAN_MR2, transport layer statistics are no longer available, and will always return UNSUPPORTED.

// static void     incrementOperationCount(int tag, int operationCount)
// Increment count of network operations performed under the given accounting tag.
// static void     incrementOperationCount(int operationCount)
// Increment count of network operations performed under the accounting tag currently active on the calling thread.
// static void     setThreadStatsTag(int tag)
// Set active tag to use when accounting Socket traffic originating from the current thread.
// static void     tagSocket(Socket socket)
// Tag the given Socket with any statistics parameters active for the current thread.
// static void     untagSocket(Socket socket)
// Remove any statistics parameters from the given Socket.


            //Return number of bytes received by this app since device boot.
        } else if (action.equals("getRxBytes")) {
            callbackContext.success(String.valueOf(TrafficStats.getUidRxBytes(appUid)));

        //Return number of packets received by this app since device boot.
        } else if (action.equals("getRxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getUidRxPackets(appUid)));

        // Return number of bytes transmitted by this app since device boot.
        } else if (action.equals("getTxBytes")) {
            callbackContext.success(String.valueOf(TrafficStats.getUidTxBytes(appUid)));

        // Return number of packets transmitted by this app since device boot.
        } else if (action.equals("getTxPackets")) {
            callbackContext.success(String.valueOf(TrafficStats.getUidTxPackets(appUid)));


        } else {
            return false;
        }
        return true;
    }
}
