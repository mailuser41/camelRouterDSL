
/**
 *
 * @author SyedN
 *
 */
@Configuration
public class RouterConfiguration {

	@Bean
	RoutesBuilder router() {
		return new RouteBuilderConfiguration();
	}
	
	public class RouteBuilderConfiguration extends RouteBuilder {
		@Override
		public void configure() throws Exception {

			from("seda:start")
					.to("{{aws.ses.route.propfiEmail}}");
		}
	}
}
