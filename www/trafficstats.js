var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec');


var successNumberCB = function(callback) {
    return function(result) {
        callback(null, parseInt(result));
    }
}

var trafficStats = {
    //Return number of bytes received across mobile networks since device boot.
    getMobileRxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getMobileRxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getMobileRxBytes', []);
    },

    //Return number of packets received across mobile networks since device boot.
    getMobileRxPackets: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getMobileRxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getMobileRxPackets', []);
    },
    //Return number of bytes transmitted across mobile networks since device boot.
    getMobileTxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getMobileTxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getMobileTxBytes', []);
    },
    //Return number of packets transmitted across mobile networks since device boot.
    getMobileTxPackets: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getMobileTxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getMobileTxPackets', []);
    },
    //Get the active tag used when accounting Socket traffic originating from the current thread.
    getThreadStatsTag: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getThreadStatsTag', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getThreadStatsTag', []);
    },
    //Return number of bytes received since device boot.
    getTotalRxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getTotalRxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTotalRxBytes', []);
    },
    //Return number of packets received since device boot.
    getTotalRxPackets: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getTotalRxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTotalRxPackets', []);
    },
    //Return number of bytes transmitted since device boot.
    getTotalTxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getTotalTxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTotalTxBytes', []);
    },
    //Return number of packets transmitted since device boot.
    getTotalTxPackets: function(callback) {
        argscheck.checkArgs('if', 'trafficstats.getTotalTxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTotalTxPackets', []);
    },

    // Return number of bytes transmitted by the given UID since device boot.
    getUidTxBytes: function(uid, callback) {
        argscheck.checkArgs('f', 'trafficstats.getUidTxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getUidTxBytes', [uid]);
    },
    // Return number of packets transmitted by the given UID since device boot.
    getUidTxPackets: function(uid, callback) {
        argscheck.checkArgs('f', 'trafficstats.getUidTxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getUidTxPackets', [uid]);
    },
    //Return number of bytes received by the given UID since device boot.
    getUidRxBytes: function(uid, callback) {
        argscheck.checkArgs('f', 'trafficstats.getUidRxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getUidRxBytes', [uid]);
    },
    //Return number of packets received by the given UID since device boot.
    getUidRxPackets: function(uid, callback) {
        argscheck.checkArgs('f', 'trafficstats.getUidRxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getUidRxPackets', [uid]);
    },


    //Return number of bytes received by this app since device boot.
    getRxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getRxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getRxBytes', []);
    },
    //Return number of packets received by this app since device boot.
    getRxPackets: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getRxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getRxPackets', []);
    },
    // Return number of bytes transmitted by this app since device boot.
    getTxBytes: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getTxBytes', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTxBytes', []);
    },
    // Return number of packets transmitted by this app since device boot.
    getTxPackets: function(callback) {
        argscheck.checkArgs('f', 'trafficstats.getTxPackets', arguments);
        exec(successNumberCB(callback), callback,
            'TrafficStats', 'getTxPackets', []);
    }
};

module.exports = trafficStats;
