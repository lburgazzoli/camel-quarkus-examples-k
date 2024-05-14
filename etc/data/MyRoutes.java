
public class MyRoutes extends org.apache.camel.builder.RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:tick")
                .to("log:info");
    }
}