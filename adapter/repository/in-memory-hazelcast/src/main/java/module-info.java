module slalom.example.db.hazelcast {
	exports com.slalom.example.db.hazelcast;

    requires services;
	requires domain;
    requires com.hazelcast.core;
}
