// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCrownOfTheDeadMDL extends EntityModel<Entity> {
	private final ModelRenderer Crown;
	private final ModelRenderer bb_main;

	public ModelCrownOfTheDeadMDL() {
		textureWidth = 64;
		textureHeight = 64;

		Crown = new ModelRenderer(this);
		Crown.setRotationPoint(0.0F, 24.0F, 0.0F);
		Crown.setTextureOffset(0, 34).addBox(-4.0F, -29.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -38.0F, -7.0F, 14.0F, 20.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Crown.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Crown.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Crown.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}